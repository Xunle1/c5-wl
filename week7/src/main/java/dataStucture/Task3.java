package dataStucture;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * @author xunle
 */
public class Task3 {

    @Test
    public void testSolution() {
        int[] nums = {1,2,3,4,2,};
        System.out.println(solution(nums));
    }

    public int solution(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], true);
            } else {
                map.put(nums[i], false);
            }
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i])) {
                count += nums[i];
            }
        }

        return count;
    }
}
