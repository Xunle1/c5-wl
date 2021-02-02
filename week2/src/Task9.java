/**
 *
 * @author Xunle
 * @date 2021/2/2 16:26
 */

public class Task9 {
    public static void main(String[] args) {
        Star star = new Star();
        star.shine();

        System.out.println("======================");

        Universe universe = new Sun();
        universe.doAnything();
        Sun sun = (Sun) universe;
        sun.shine();

    }
}
