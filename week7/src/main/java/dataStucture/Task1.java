package dataStucture;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author xunle
 */
public class Task1 {
    @Test
    public void testSolution() {
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};

        int[] nums3 = solution(nums1,nums2);

        for (int i = 0; i < nums3.length; i++) {
            System.out.print(nums3[i] + " ");
        }
    }

    public int[] solution(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        stack.push(nums2[0]);
        for (int i = 1; i < nums2.length; i++) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
//                System.out.println("比" + nums2[i] + "小的：" + stack.pop() + "出栈");
//                System.out.println(stack.push(nums2[i]) + "入栈");
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
//            System.out.println("比" + stack.peek() + "小的：" + stack.push(nums2[i]) + "入栈");
        }
        System.out.println(stack);
        int[] nums3 = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            if (map.get(nums1[i]) == null){
                nums3[i] = -1;
            } else {
                nums3[i] = map.get(nums1[i]);
            }
        }
        return nums3;
    }
}
