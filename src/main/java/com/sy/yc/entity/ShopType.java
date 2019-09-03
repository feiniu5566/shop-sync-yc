package com.sy.yc.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName ShopType
 * @Description: TODO
 * @Author Administrator
 * @Date 2019/9/2
 * @Version V1.0
 **/
@Data
public class ShopType implements Serializable {
    //             | id           | varchar(100) | NO   | PRI | NULL    |       |
    //            | shopId       | varchar(100) | YES  |     | NULL    |       |
    //            | shopTypeName | varchar(100) | YES  |     | NULL    |       |
    //            | parentId     | varchar(100) | YES  |     | NULL    |       |
    //            | sortOrder    | varchar(100) | YES  |     | NULL    |       |
    //            | createTime   | datetime(3)  | YES  |     | NULL    |       |
    //            | cTimeStamp   | datetime(3)  | YES  |     | NULL    |

    private String id;
    private String shopId;
    private String shopTypeName;
    private String parentId;
    private String sortOrder;
    private Date createTime;
    private Date cTimeStamp;
}
