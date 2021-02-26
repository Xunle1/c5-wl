import java.util.HashMap;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String strings = in.next();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        char[] chars = strings.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (!hashMap.containsKey(chars[i])) {
                hashMap.put(chars[i], 1);
            } else {
                Integer count = hashMap.get(chars[i]);
                count++;
                hashMap.put(chars[i], count);
            }
        }
        System.out.println(hashMap);
    }
}
