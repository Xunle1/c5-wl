import java.util.Scanner;

/**
 * @author Xunle
 * 整数反转
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x < 0) {
            int y = 0 - reverse(0-x);
            System.out.println(y);
        } else {
            System.out.println(reverse(x));
        }
    }

    static int reverse(Integer x) {
        int reverseX = 0;
        int count = 0;
        String stringx = x.toString();
        while (x > 0) {
            int i = x % 10;
            x = x / 10;

            reverseX += i * (int)Math.pow(10,stringx.length()-1-count++);
        }
        return reverseX;
    }
}
