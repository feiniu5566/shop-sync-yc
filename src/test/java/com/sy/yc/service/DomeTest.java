package com.sy.yc.service;

import com.sy.yc.dao.DomeMapper;
import com.sy.yc.entity.Dome;
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
public class DomeTest {
    @Autowired
    private DomeMapper domeMapper;
//    @Test
    public void InsertDomeTest(){
        Dome dome=new Dome();
        dome.setUserName("Test");
        dome.setPassword("123456");
        System.out.println(domeMapper.insertdome(dome));
    }
    @Test
//    @Ignore
    public void SelectAllTest(){
        List list=domeMapper.selectAll();
        for(Object dome:list){
            System.out.println(dome.toString());
        }
    }
}