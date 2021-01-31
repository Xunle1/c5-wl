import java.util.Scanner;

/**
 * 给定一个 n × n 的二维矩阵matrix表示一个图像。请你将图像顺时针旋转90度。
 * @author Xunle
 * @date 2021/1/31 19:32
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println("请输入n：");
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("请输入数组matrix：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        System.out.println("旋转前matrix为：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
        rotating(matrix);
        System.out.println("旋转后matrix为：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void rotating(int[][] matrix) {
        int n = matrix.length;
        //转置
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //镜面对称
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }
}
