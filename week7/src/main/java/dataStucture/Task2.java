package dataStucture;

import org.junit.jupiter.api.Test;

import java.util.Stack;

/**
 * @author xunle
 */
public class Task2 {
    @Test
    public void testSolution() {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        System.out.println(solution(pushed,popped));
    }

    public boolean solution(int[] pushed, int[] popped) {
        int len1 = pushed.length;
        int len2 = popped.length;

        Stack<Integer> stack = new Stack<>();

        //记录pushed和popped
        int i = 0;
        int j = 0;

        while (i < len1) {
            //如果pushed[i]不等于popped[j]，则pushed[i]入栈，如果等于则代表该出栈
            stack.push(pushed[i]);
            while (pushed[i] != popped[j]) {
                i++;
                stack.push(pushed[i]);
            }

            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                i++;
                j++;
            }
        }
        //若成功匹配，栈为空
        return stack.isEmpty();
    }
}
