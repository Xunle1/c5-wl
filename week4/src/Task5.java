import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task5 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        int[] nums = {1,2,5,9,5,9,5,5,5};

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                Integer count = map.get(nums[i]);
                map.put(nums[i], ++count);
            }
        }

        Set<Integer> set = map.keySet();

        boolean flag = false;
        for (Integer integer:set) {
            Integer count = map.get(integer);

            if (count > nums.length/2) {
                System.out.println(integer);
                flag = true;
            }
        }
        if (!flag) System.out.println(-1);
    }
}
