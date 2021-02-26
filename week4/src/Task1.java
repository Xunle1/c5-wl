import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String string = (new Scanner(System.in)).next();
        String pattern = (new Scanner(System.in)).next();

        System.out.println(string.indexOf(pattern));
    }
}
