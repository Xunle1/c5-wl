package com.xunle.service;

import com.xunle.dao.UserMapper;
import com.xunle.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xunle
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {

        return userMapper.findAll();
    }

    public void register(User user) {
        userMapper.register(user);
    }

    public Boolean login(String mobile, String password){
        return userMapper.login(mobile,password);
    }

    public User findById(int id){
        return userMapper.findById(id);
    }
}
