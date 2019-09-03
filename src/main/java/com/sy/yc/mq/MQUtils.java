package com.sy.yc.mq;

import com.sy.sa.common.base.UUID;
import com.sy.sa.mq.client.callback.ProducerCallback;
import com.sy.sa.mq.client.producer.MessagePacker;
import com.sy.sa.mq.client.producer.ProduceClient;
import com.sy.sa.mq.client.producer.ProducerFactory;
import com.sy.sa.mq.exception.MqVerifyException;

import java.util.List;

/**
 * @ClassName MQUtils
 * @Description: TODO
 * @Author Administrator
 * @Date 2019/9/2
 * @Version V1.0
 **/
public class MQUtils {
    private static final ProduceClient psm = ProducerFactory.getInstanceNoVipChannel("base.mq.goo.com:9877");

//    public static void sendEmailWithAttachment(final List<String> emailAddresses, String fileName, String subject, String textContent) throws MqVerifyException, InterruptedException {
//        MQEmail mqEmail = new MQEmail();
//        mqEmail.setUuid(UUID.getUUID());
//        mqEmail.setTo(emailAddresses);
//        mqEmail.setSubject(subject);
//        mqEmail.setText(textContent);
//        MessagePacker packer = new MessagePacker("Email", "TagA", UUID.getUUID(), mqEmail);
//        psm.start();
//        psm.send(packer, new ProducerCallback() {
//            @Override
//            public void onSuccess(Object o) {
//                GooagooLog.info("给"+emailAddresses+"邮件发送成功");
//            }
//
//            @Override
//            public void onFail(Object o, String s) {
//                GooagooLog.error("给"+emailAddresses+"邮件发送失败"+"==="+s);
//            }
//
//            @Override
//            public void onThrowable(Object o, Throwable throwable) {
//                GooagooLog.info("给"+emailAddresses+"邮件发送异常",throwable);
//            }
//        });
//    }

    public static void sendMsg(String topic,String tag,Object msg) throws InterruptedException ,MqVerifyException{
        MessagePacker packer = new MessagePacker(topic, tag, UUID.getUUID(), msg);
        psm.start();
        psm.send(packer, new ProducerCallback(){
            @Override
            public void onSuccess(Object o) {
                //GooagooLog.info("给"+emailAddresses+"邮件发送成功");
                System.out.println("生产成功了");
            }
            @Override
            public void onFail(Object o, String s) {
                //GooagooLog.error("给"+emailAddresses+"邮件发送失败"+"==="+s);
            }
            @Override
            public void onThrowable(Object o, Throwable throwable) {
                //GooagooLog.info("给"+emailAddresses+"邮件发送异常",throwable);
            }
        });
    }

    public static void sendMsgs(String topic,String tag,List<Object> dataList) throws InterruptedException ,MqVerifyException{
        if (null==dataList||dataList.size()==0){
            return;
        }
        for (Object obj:dataList){
            sendMsg(topic,tag,obj);
        }
    }

}
