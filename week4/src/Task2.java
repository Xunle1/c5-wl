import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String string = new Scanner(System.in).next();

        char[] chars = string.toCharArray();

        System.out.println(find(chars));
    }

    public static int find(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            boolean flag = false;
            char c = chars[i];

            for (int j = i + 1; j < chars.length; j++) {
                if (c == chars[j]) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                return i;
            }
        }

        return -1;
    }
}
