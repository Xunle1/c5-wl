package com.xunle.boot.mapper;

import com.xunle.boot.domain.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author xunle
 */

@Mapper
public interface AccountDao {

    /**
     * 查询所有账户
     * @return 返回所有账户信息
     */
    List<Account> findAll();

    /**
     * 删除指定账户
     * @param id 账户id
     * @return 返回
     */
    Integer deleteByPrimaryKey(String id);

    /**
     * 插入一个账户
     * @param account 传入账户信息
     * @return 返回
     */
    Integer insert(Account account);

    /**
     * 根据id查询账户信息
     * @param id 传入账户的id
     * @return 返回账户信息
     */
    Account selectByPrimaryKey(String id);

    /**
     * 根据id更新账户信息
     * @param account 传入更新账户信息
     * @return 返回
     */
    Integer updateByPrimaryKey(Account account);
}
