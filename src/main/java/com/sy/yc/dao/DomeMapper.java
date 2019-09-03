package com.sy.yc.dao;


import com.sy.yc.entity.Dome;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DomeMapper {
    List<Dome> selectAll();
    int insertdome(Dome dome);
}
