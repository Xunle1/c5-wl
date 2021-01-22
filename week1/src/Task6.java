import java.util.Scanner;

/**
 * @author Xunle
 * @date 2021/1/22 21:45
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入账户名及余额");
        String name = in.next();
        double balance = in.nextDouble();
        Account account = new Account(name, balance);
        System.out.println("该账户余额为：" + account.getBalance());
    }

    static class Account{
        String name;
        double balance;

        public Account(){}

        public Account(String name, double balance) {
            this.name = name;
            this.balance = balance;
        }

        public double getBalance() {
            return this.balance;
        }
    }
}
