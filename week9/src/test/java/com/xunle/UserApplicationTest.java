package com.xunle;

import com.xunle.pojo.User;
import com.xunle.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Date;


/**
 * @author xunle
 */
@SpringBootTest("")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserApplicationTest {
    @Autowired
    UserService userService;

    @Test
    public void test() {

//        User user = new User(2,"keio","1008611","1008611","娄奚",
//                new Date(System.currentTimeMillis()),"男","163@qq.com",new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()));
//        System.out.println(new Date(System.currentTimeMillis()));
//        System.out.println(user);
//        userService.register(user);
        Boolean flag = userService.login("10086","1008611");
        System.out.println(flag);
        if (flag) {
            System.out.println("登录成功");
        } else {
            System.out.println("登陆失败");
        }

    }
}
