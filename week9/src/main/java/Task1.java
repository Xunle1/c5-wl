import java.util.*;

/**
 * @author xunle
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            list.add(random.nextInt(200));
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

        //利用HashMap存储整数及对应的次数
        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer integer : list) {
            if (!map.containsKey(integer)) {
                map.put(integer,1);
            } else {
                int count = map.get(integer);
                map.put(integer,++count);
            }
        }

        //记录次数
        int[] counts = {0,0,0,0,0,0,0,0,0,0};
        //记录对应次数的整数
        int[] result = new int[10];
        //获得Entry键值对
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            for (int i = 0; i < counts.length; i++) {
                //如果该整数的次数大于counts中的任一次数，则替换该数
                if (entry.getValue() > counts[i]) {
                    counts[i] = entry.getValue();
                    result[i] = entry.getKey();
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("result:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            System.out.print(counts[i] + " ");
        }

    }
}
