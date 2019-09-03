package com.sy.yc.dao;


import com.sy.yc.entity.ShopType;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ShopTypeMapper {
    List<ShopType> selectAll();
//    int insertdome(Dome dome);
}
