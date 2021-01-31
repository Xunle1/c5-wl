import java.util.ArrayList;
import java.util.Scanner;

/**
 * 找出字符串中的数字
 * @author Xunle
 * @date 2021/1/31 20:31
 */
public class Task3 {
    public static void main(String[] args) {
        String str;
        System.out.println("请输入字符串：");
        Scanner in = new Scanner(System.in);
        str = in.next();
        findNumber(str);
    }

    public static void findNumber(String str) {
        int length = 0;
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            //index记录起始下标，flag判断是否添加进nums，length为添加字符串的长度
            int index = i;
            int flag = 0;
            length = 0;

            //str[i]为数字且i不越界，使length++，flag=1
            for (; i < str.length() && Character.isDigit(str.charAt(i)) ;i++) {
                length++;
                flag = 1;
            }
            if (flag == 1) {
                nums.add(Integer.parseInt(str.substring(index, index + length)));
            }
        }

        System.out.println("字符串中的数字为：");
        System.out.println(nums);
    }
}
