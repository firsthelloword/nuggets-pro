package com.zyk.common.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author zhangyongkai
 * @date 2023/4/18 15:56
 */
@Getter
@Setter
public class BaseEntity {

    private Integer id;
    private Date createTime;
    private Date updateTime;
}
