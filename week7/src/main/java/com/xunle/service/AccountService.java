package com.xunle.service;

import com.xunle.dao.AccountDao;
import com.xunle.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.beans.Transient;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author xunle
 */
public class AccountService {

    private InputStream inputStream;
    private SqlSession sqlSession;
    private AccountDao accountDao;

    public AccountService() throws IOException {
        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = factory.openSession();

        accountDao = sqlSession.getMapper(AccountDao.class);
    }

    private void destroy() {
        try {
            sqlSession.commit();
            sqlSession.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 1查询所有记录
    public List<Account> findAll() {
        List<Account> list = accountDao.findAll();
        destroy();
        return list;
    }
    // 2通过id删除记录
    public void deleteByPrimaryKey(String id) {
        Integer count = accountDao.deleteByPrimaryKey(id);
        System.out.println(count);
        destroy();
    }
    // 3插入记录
    public void insert(Account record) {
        accountDao.insert(record);
        destroy();
    }

    // 4通过id查找对象
    public Account selectByPrimaryKey(String id) {
        Account account = accountDao.selectByPrimaryKey(id);
        destroy();
        return account;
    }

    // 5更新Account
    public void updateByPrimaryKey(Account record) {
        accountDao.updateByPrimaryKey(record);
        destroy();
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
        destroy();
    }
}
