package com.xunle.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;


/**
 * @author xunle
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String mobile;
    private String password;
    private String name;
    private Date birthday;
    private String sex;
    private String email;
    private Date createtime;
    private Date updatetime;
}
