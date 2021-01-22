/**
 * @author Xunle
 * @date 2021/1/22 20.53
 */
public class Task2 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int j = i / 100;
            int k = (i / 10) % 10;
            int l = i % 10;
            if (i == (Math.pow(j,3) + Math.pow(k,3) + Math.pow(l,3))) {
                System.out.println(i);
            }
        }
    }
}
