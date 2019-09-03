package com.sy.yc.service;

import com.sy.yc.dao.ShopTypeMapper;
import com.sy.yc.entity.ShopType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName DomeService
 * @Description: TODO
 * @Author Administrator
 * @Date 2019/8/30
 * @Version V1.0
 **/
@Service
public class ShopTypeService {

    @Autowired
    private ShopTypeMapper shopTypeMapper;

    public List<ShopType> shopTypeList(){
        return shopTypeMapper.selectAll();
    }
}
