import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * @author Xunle
 * @date 2021/12/22 20:41
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double weight, height;

        System.out.println("请输入体重（kg）：");
        weight = in.nextDouble();
        System.out.println("请输入身高（m）：");
        height = in.nextDouble();
        if (weight > 0 && height > 0) {
            bmi(weight, height);
        } else {
            System.out.println("输入错误！");
        }
    }

    static void bmi(double weight, double height) {
        double BMI = weight / Math.pow(height, 2);
        if (BMI < 18.5) {
            System.out.println("过轻");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("正常");
        } else if (BMI >= 25 && BMI < 28) {
            System.out.println("过重");
        } else if (BMI >= 28 && BMI < 32) {
            System.out.println("肥胖");
        } else if (BMI >= 32){
            System.out.println("非常肥胖");
        }
    }
}
