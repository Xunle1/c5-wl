package com.xunle.dao;

import com.xunle.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xunle
 */
@Mapper
public interface UserMapper {

    List<User> findAll();

    void register(User user);

    Boolean login(@Param("mobile") String mobile, @Param("password") String password);

    User findById(int id);
}
