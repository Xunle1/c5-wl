import com.xunle.dao.AccountDao;
import com.xunle.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author xunle
 */
public class AccountDaoTest {

    private InputStream inputStream;
    private SqlSession sqlSession;
    private AccountDao accountDao;
    @Before
    public void init() throws IOException {
        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = factory.openSession();

        accountDao = sqlSession.getMapper(AccountDao.class);
    }

    @After
    public void destroy() throws IOException{
        sqlSession.close();
        inputStream.close();
    }

    @Test
    public void testFindAll() {
        List<Account> list = accountDao.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
    }

    @Test
    public void testDeleteByPrimaryKey() {
        Integer count = accountDao.deleteByPrimaryKey("5");
        System.out.println(count);
    }

    @Test
    public void testInsert() {
        Account account = new Account();
        account.setId("4");
        account.setName("xunle");
        account.setMoney(2000);
        account.setCreatetime(new Date());
        Integer count = accountDao.insert(account);
        System.out.println(count);
    }

    @Test
    public void testSelectByPrimaryKey() {
        Account account = accountDao.selectByPrimaryKey("4");
        System.out.println(account);
    }

    @Test
    public void testUpdateByPrimaryKey() {
        Account account = new Account();
        account.setId("5");
        account.setName("keio");
        account.setMoney(700);
        account.setUpdatetime(new Date());
        Integer count = accountDao.updateByPrimaryKey(account);
    }
}
