import java.util.HashSet;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String test = in.next();

        HashSet<Character> set = new HashSet<>();

        char[] chars = test.toCharArray();

        for(int i = 0; i < chars.length; i++) {
            set.add(chars[i]);
        }

        StringBuilder target = new StringBuilder();

        for(Character character:set) {
            target.append(character);
        }

        System.out.println(target);
    }
}
