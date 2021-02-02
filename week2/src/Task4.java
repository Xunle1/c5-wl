import java.util.Scanner;

/**
 * 猜数字游戏
 * @author Xunle
 * @data 2021/2/2 15:06
 */

public class Task4 {
    public static void main(String[] args) {
        Game game = new Game();
        game.guess();
    }

    static class Game {
        private static final int V = 100;

        public Game() {
        }

        protected void guess() {
            System.out.println("欢迎来到猜数游戏，请输入一个数：");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            while(true) {
                if (num < V) {
                    System.out.println("猜的有点小，再试一下吧！");
                    num = in.nextInt();
                } else if (num > V) {
                    System.out.println("猜的有点大，再试一下吧！");
                    num = in.nextInt();
                } else {
                    System.out.println("恭喜你猜对了！");
                    break;
                }
            }
        }
    }
}
