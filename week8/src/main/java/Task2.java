import java.util.Scanner;

/**
 * @author xunle
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();


        boolean flag = true;
        //判断回文
        for (int i = 0; i < s.length() / 2; i++) {
            int j = s.length()-i-1;
            if (s.charAt(i) != s.charAt(j)) {
                //如果还没有删除，则进行删除

                    if (!isPalindrome(s.substring(i+1,j)) || !isPalindrome(s.substring(i,j-1))) {
                        flag = false;
                        break;
                    } else {
                        break;
                    }

            }
        }



        System.out.println(flag);
    }

    public static boolean isPalindrome (String s) {
        boolean flag = true;

        for (int i = 0; i < s.length() / 2; i++) {
            int j = s.length()-i-1;
            if (s.charAt(i) != s.charAt(j)) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
