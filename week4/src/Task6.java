import java.util.Scanner;
import java.util.Stack;

public class Task6 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        Scanner in = new Scanner(System.in);
        String string = in.next();
        char[] chars = string.toCharArray();

        System.out.println(match(chars, stack));
    }

    public static boolean match(char[] chars, Stack<Character> stack) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                stack.push(chars[i]);
            } else if (chars[i] == ')') {
                char c = stack.pop();
                if (c != '(') return false;
            } else if (chars[i] == ']') {
                char c = stack.pop();
                if (c != '[') return false;
            } else if (chars[i] == '}') {
                char c = stack.pop();
                if (c != '{') return false;
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
}
