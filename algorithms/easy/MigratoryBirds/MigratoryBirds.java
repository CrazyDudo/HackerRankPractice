import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;

import javax.sound.sampled.SourceDataLine;

public class MigratoryBirds {
    // https://www.hackerrank.com/challenges/migratory-birds
    // 概要:找出一组整数中，出现频次最高的数，若有多个高频数，取最小数。
    // 思路:遍历算出每个数字频次，比较判断

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            int temp = arr.get(i);

            if (map.containsKey(temp)) {

                int count = map.get(temp) + 1;

                map.put(temp, count);
            } else {
                map.put(temp, 1);
            }

        }

        int max = 0;
        int maxKey = 0;
        for (Integer key : map.keySet()) {

            System.out.println(key + "出现的次数是：" + map.get(key));
            int temp = map.get(key);
            if (temp > max) {
                maxKey = key;
                max = temp;
            }

        }

        return maxKey;

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        migratoryBirds(list);
    }

}