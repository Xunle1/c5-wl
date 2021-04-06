import java.util.Scanner;

/**
 * @author xunle
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        StringBuilder builder = new StringBuilder();

        int count = 0;
        boolean flag = true;
        while (x != 1) {
            //乘二
            x *= 2;
            if (x > 1) {
                x -= 1;
                builder.append(1);
            } else if (x < 1){
                builder.append(0);
            } else {
                builder.append(1);
                break;
            }
            count++;
            if (count >= 32) {
                flag = false;
                break;
            }
        }
        builder = builder.insert(0,"0.");
        if (flag) {
            System.out.println(builder);
        } else {
            System.out.println("ERROR");
        }
    }
}
