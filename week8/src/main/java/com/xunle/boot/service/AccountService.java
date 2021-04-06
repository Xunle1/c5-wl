package com.xunle.boot.service;

import com.xunle.boot.domain.Account;
import com.xunle.boot.mapper.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xunle
 */

@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    /**
     * 查询所有账户
     * @return 返回所有账户信息
     */
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    /**
     * 删除指定账户
     * @param id 账户id
     * @return 返回
     */
    public Integer deleteByPrimaryKey(String id) {
        return accountDao.deleteByPrimaryKey(id);
    }

    /**
     * 插入一个账户
     * @param account 传入账户信息
     * @return 返回
     */
    public Integer insert(Account account) {
        return accountDao.insert(account);
    }

    /**
     * 根据id查询账户信息
     * @param id 传入账户的id
     * @return 返回账户信息
     */
    public Account selectByPrimaryKey(String id) {
        return accountDao.selectByPrimaryKey(id);
    }

    /**
     * 根据id更新账户信息
     * @param account 传入更新账户信息
     * @return 返回
     */
    public Integer updateByPrimaryKey(Account account) {
        return accountDao.updateByPrimaryKey(account);
    }

    // 6转账功能 输入转出人id，转入人id，转账金额 实现转账
    public void transfer(String remitterId,String remitteeId,int money) {
        //1.获得账户
        Account remitter = accountDao.selectByPrimaryKey(remitterId);
        Account remittee = accountDao.selectByPrimaryKey(remitteeId);
        //2.更新账户信息
        remitter.setMoney(remitter.getMoney()-money);
        remittee.setMoney(remittee.getMoney()+money);
        //3.调用dao
        accountDao.updateByPrimaryKey(remitter);
        accountDao.updateByPrimaryKey(remittee);

    }
}
