import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Xunle
 * @date 2021/2/15 21:39
 */

public class Task1 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int target = 0;

        threeSum(nums, target);
    }


    public static List<List<Integer>> threeSum(int[] nums, int target) {
        List<Integer> integerList = new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == target) {
                        Collections.addAll(integerList, nums[i], nums[j], nums[k]);
                        //System.out.println(integerList);
                        lists.add(integerList);
                        System.out.println(lists);
                        //System.out.println(integerList);
                    }
                }
            }
        }
        return lists;
    }

}
