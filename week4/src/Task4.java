import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {4,4,2,3,1,0,0,2,5};

        int k = in.nextInt();

        Arrays.sort(nums);
        int i = 0;


        while (i < k - 1) {
            i++;
        }

        System.out.println(nums[i]);
    }
}
