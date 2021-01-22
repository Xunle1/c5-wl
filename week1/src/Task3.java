import java.util.Scanner;

/**
 * @author Xunle
 * @date 2021/1/22 21:03
 */
public class Task3 {
    public static void main(String[] args) {
        char[] chars;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入字符串：");
        chars = in.next().toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }

        System.out.println(chars);
    }
}
