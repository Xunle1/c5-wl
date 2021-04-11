package com.xunle;

import com.xunle.pojo.User;
import com.xunle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.util.List;

/**
 * @author xunle
 */
@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);

    }

}
