/**
 * @author xunle
 */
public class Task2 {
    public static void main(String[] args) {
        int n = 10;
        //数组中剩下的数
        int ret = n;
        int m = 17;

        //用1表示该下标的数字存活，0表示出圈
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = 1;
        }

        int count = 0;
        //当剩下一个数时停止循环
        while (ret > 1) {
            for (int i = 0; i < n; i++) {
                //先判断该数是否存货
                if (nums[i] == 1) {
                    //如果存活，计数器+1
                    count++;
                    //当计数器等于m时移出该下标的数字，计数器归零
                    if (count == m) {
                        nums[i] = 0;
                        ret--;
                        count = 0;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                System.out.println(i);
            }
        }
    }
}
