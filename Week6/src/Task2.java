import java.util.ArrayList;
import java.util.List;

/**
 * @author xunle
 */
public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        System.out.println(spinMatrix(matrix));
    }

    public static List<Integer> spinMatrix(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return list;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        //路径总长度 = 数组元素个数
        int total = m * n;
        //辅助数组
        boolean[][] marked = new boolean[m][n];

        //顺时针旋转数组(left->right,up->bottom,right->left,bottom->up)
        int[][] directions = {
                {0,1},
                {1,0},
                {0,-1},
                {-1,0}
        };
        //旋转的索引,从左上角开始
        int directionIndex = 0;
        int row = 0, column = 0;

        for (int i = 0; i < total; i++) {
            list.add(matrix[row][column]);
            marked[row][column] = true;
            //下一个元素索引
            int nextRow = row + directions[directionIndex][0], nextColumn = column + directions[directionIndex][1];
            //判断是否到达边界或者下一个元素是否被访问
            if (nextRow < 0 || nextRow >= m || nextColumn < 0 || nextColumn >= n || marked[nextRow][nextColumn]) {
                //旋转方向改变
                directionIndex = (directionIndex+1) % 4;
            }
            row += directions[directionIndex][0];
            column += directions[directionIndex][1];
        }

        return list;
    }
}
