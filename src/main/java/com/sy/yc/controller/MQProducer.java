package com.sy.yc.controller;

import com.sy.yc.dict.DictInfo;
import com.sy.yc.entity.ShopType;
import com.sy.yc.mq.MQUtils;
import com.sy.yc.service.ShopTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName MQProducer
 * @Description: TODO
 * @Author Administrator
 * @Date 2019/9/2
 * @Version V1.0
 **/
@Controller
@RequestMapping("/mq")
public class MQProducer {
    @Autowired
    private ShopTypeService shopTypeService;

    @ResponseBody
    @RequestMapping("/shopType")
    public  String sendShopType(){
        System.out.println("come in");
        try {
            //获取业态列表
            List typeList=shopTypeService.shopTypeList();
            MQUtils.sendMsgs("shopTypecc","add",typeList);
//            MQUtils.sendMsgs(DictInfo.SHOP_TYPE_TOPIC,"add",typeList);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }
}
