import java.util.Scanner;

/**
 * @author Xunle
 * @date 2021/1/22 21:11
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数组nums大小：");
        int lenth = in.nextInt();
        int[] nums = new int[lenth];
        System.out.println("请输入数组nums：");
        for (int i = 0; i < lenth; i++) {
            nums[i] = in.nextInt();
        }
        move(nums);

    }

    public static void move(int[] nums){
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                temp++;
            } else if (temp != 0) {
                nums[i - temp] = nums[i];
                nums[i] = 0;
            }
        }
        for (Integer i: nums){
            System.out.println(i);
        }
    }
}
