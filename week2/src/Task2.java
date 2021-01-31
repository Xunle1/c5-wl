import java.util.Scanner;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串 ""
 * @author Xunle
 * @date 2021/1/31 20:09
 */
public class Task2 {
    public static void main(String[] args) {
        String[] strings = new String[3];
        System.out.println("输入字符串：");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = in.next();
        }

        System.out.println("最长公共前缀为：" +longestCommonPrefix(strings));
    }

    public static String longestCommonPrefix(String[] strings) {
        String str = "";
        int flag = 1;
        int length = 0;
        for (int i = 1; i < strings[0].length(); i++) {
            str = strings[0].substring(0,i);
            for (String s: strings) {
                if (str.equals(s.substring(0,i))) {
                    flag = 1;
                } else {
                    flag = 0;
                    break;
                }
            }
            if (flag == 0) {
                length = i - 1;
                break;
            }
        }
        str = strings[0].substring(0,length);
        return str;
    }
}
