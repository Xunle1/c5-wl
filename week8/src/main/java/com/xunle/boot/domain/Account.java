package com.xunle.boot.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author xunle
 */

@Data
public class Account {
    private String id;
    private String name;
    private int money;
    private Date createtime;
    private Date updatetime;
}
