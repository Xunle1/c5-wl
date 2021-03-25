import com.xunle.domain.Account;
import com.xunle.service.AccountService;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @author xunle
 * AccountService测试类
 */
public class AccountServiceTest {

    private AccountService accountService;

    @Before
    public void init() throws IOException{
        accountService = new AccountService();
    }

    @Test
    public void testFindAll(){
        List<Account> list = accountService.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
    }

    @Test
    public void testDeleteByPrimaryKey() {
        accountService.deleteByPrimaryKey("6");
    }

    @Test
    public void testInsert() throws IOException{

        Account account = new Account();
        account.setId("6");
        account.setName("Esaka");
        account.setMoney(1300);
        account.setCreatetime(new Date());

        accountService.insert(account);
    }

    @Test
    public void testSelectByPrimaryKey() {
        Account account = accountService.selectByPrimaryKey("5");
        System.out.println(account);
    }

    @Test
    public void updateByPrimaryKey() {
        Account account = new Account();
        account.setId("4");
        account.setName("xunle");
        account.setMoney(2100);
        account.setUpdatetime(new Date());
        accountService.updateByPrimaryKey(account);
    }

    @Test
    public void transfer() {
        Integer money = 500;

        accountService.transfer("4","5",money);
    }
}
