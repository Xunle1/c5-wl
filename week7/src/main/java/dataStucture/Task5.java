package dataStucture;

import org.junit.jupiter.api.Test;

/**
 * @author xunle
 */
public class Task5 {

    @Test
    public void testSolution() {
        int[] nums = {1,1,1,1,1,0,1,1,1,1};
        System.out.println(solution(nums));
    }

    public int solution(int[] nums) {

        int left = 0 ,right = 0;

        int i = 0;
        int max = 0;
        while (right < nums.length) {
             if (nums[right] == 1) {
                 //如果nums[right]==1 窗口扩大
                 right++;
                 //修改max值
                 max = (right - left) > max ? (right - left) : max;
             } else {
                 //否则left和right跳过该索引
                 right++;
                 left = right;
             }
        }

        return max;
    }
}
