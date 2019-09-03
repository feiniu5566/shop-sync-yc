package com.sy.yc.controller;

import com.sy.yc.dict.DictInfo;
import com.sy.yc.entity.ShopType;
import com.sy.yc.mq.MQUtils;
import com.sy.yc.service.ShopTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName Main
 * @Description: TODO
 * @Author Administrator
 * @Date 2019/9/2
 * @Version V1.0
 **/
@Component
public class Main
{
    @Autowired
    private ShopTypeService shopTypeService;

    public  void sendShopType(){
        try {
            //获取业态列表
            List<ShopType> typeList=shopTypeService.shopTypeList();
            MQUtils.sendMsg(DictInfo.SHOP_TYPE_TOPIC,"add",typeList);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        shopEntityInfo add 3/99999 abcd 批次号
//        args = new String[] {"shopEntityInfo", "add", "3", "abcd"};
        if (args.length < 4) {
            System.err.println("Usage: <bizName> <tag> <nums> <batchNo> ");
            System.err.println("e.g. shopType add 3 abcd ");
            System.exit(1);
        }
        System.out.println("your params are:");
        for (String s:args){
            System.out.print(s+"\t");
        }
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:spring-mvc.xml");
        Main main=(Main) ac.getBean("Main");
        main.sendShopType();


    }
}
