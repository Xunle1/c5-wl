import java.util.Random;

/**
 * @author xunle
 * 生成随机数组
 */
public class SortUtils {
    public static int[] getRandomArray() {
        Random random = new Random();

        int[] randomArray = new int[10];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
        }

        return randomArray;
    }

    public static void exchange(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
