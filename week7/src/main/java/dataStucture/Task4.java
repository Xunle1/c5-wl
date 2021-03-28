package dataStucture;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xunle
 */
public class Task4 {

    @Test
    public void testSolution() {
        int[] nums = {1,3,-1,-3,5,3,6,7,3};
        int k = 3;
        System.out.println(solution(nums,k));
        System.out.println(solution2(nums,k));
    }

    public List<Integer> solution(int[] nums, int k) {
        //定义窗口
        int[] window = new int[k];
        //定义返回最大值集合list
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - k + 1; i++) {
            for (int j = 0; j < k; j++) {
                //将数组元素填入窗口
                window[j] = nums[i + j];
            }
            int max = window[0];
            for (int j = 1; j < k; j++) {
                //窗口内求最大值
                if (max < window[j]) {
                    max = window[j];
                }
            }
            list.add(max);
        }
        return list;
    }

    public List<Integer> solution2(int[] nums, int k) {
        int left = 0;
        int right = left + k -1;
        List<Integer> list = new ArrayList<>();

        for (; right < nums.length; left++,right++) {
            int max = nums[left];
            for (int i = left; i < right + 1; i++) {
                if (max < nums[i]) {
                    max = nums[i];
                }
            }
            list.add(max);
        }
        return list;
    }
}
