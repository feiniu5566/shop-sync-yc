package com.sy.yc.service;

import com.sy.yc.dao.ShopTypeMapper;
import com.sy.yc.entity.ShopType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName DomeTest
 * @Description: TODO
 * @Author Administrator
 * @Date 2019/8/30
 * @Version V1.0
 **/


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class ShopTypeTest {
    @Autowired
    private ShopTypeMapper shopTypeMapper;
    @Test
//    @Ignore
    public void SelectAllTest(){
        List<ShopType> list=shopTypeMapper.selectAll();
        for (ShopType st:list){
            System.out.println(st.toString());
        }
    }
}