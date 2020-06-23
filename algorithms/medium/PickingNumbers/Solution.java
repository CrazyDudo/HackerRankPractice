import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    // 链接:https://www.hackerrank.com/challenges/picking-numbers
    // 概要:在一组整数中选出，满足条件的最长新数组；条件：新数组中任意两数之差的绝对值小于等于1。
    // 思路:1.选出频度最高的数字；2.选出相邻最高频次的数字；3.计算数组长度
    // 缺陷：若频次非第一高（如第二高），与其相邻数字频次，加和最高，则无法正确统计

    public static int pickingNumbers(List<Integer> a) {

        int targetArrayLenth = 0;
        int maxCountKey;
        // 统计频次
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.size(); i++) {
            if (map.containsKey(a.get(i))) {
                map.put(a.get(i), map.get(a.get(i)) + 1);
            } else {
                map.put(a.get(i), 1);
            }
        }

        List xlist = new ArrayList<>(map.entrySet());

        System.out.println(xlist);
        // 1.选出频度最高的数字
        List<Map.Entry<Integer, Integer>> list = new ArrayList(map.entrySet());
        Collections.sort(list, (o1, o2) -> (o1.getValue() - o2.getValue()));
        System.out.println(list.get(map.size() - 1).getKey());

        maxCountKey = list.get(map.size() - 1).getKey();
        // 2.选出相邻最高频次的数字;3.计算数组长度
        if (map.get(maxCountKey - 1) != null && map.get(maxCountKey + 1) != null) {

            if (map.get(maxCountKey - 1) > map.get(maxCountKey + 1)) {
                targetArrayLenth = map.get(maxCountKey) + map.get(maxCountKey - 1);
                // 1
                System.out.println(1);
            } else {
                // 2

                targetArrayLenth = map.get(maxCountKey) + map.get(maxCountKey + 1);

                System.out.println(2);
            }

        } else if (map.get(maxCountKey - 1) != null) {

            targetArrayLenth = map.get(maxCountKey) + map.get(maxCountKey - 1);

            // 3
            System.out.println(3);
        }

        else if (map.get(maxCountKey + 1) != null) {
            targetArrayLenth = map.get(maxCountKey) + map.get(maxCountKey + 1);

            // 4
            System.out.println(4);
            System.out.println(map.get(maxCountKey + 1));
        }

        return targetArrayLenth;

    }

    public static void main(String[] args) {

        List a = new ArrayList<Integer>();

        // 4 6 5 3 3 1
        // 4 2 3 4 4 9 98 98 3 3 3 4 2 98 1 98 98 1 1 4 98 2 98 3 9 9 3 1 4 1 98 9 9 2 9
        // 4 2 2 9 98 4 98 1 3 4 9 1 98 98 4 2 3 98 98 1 99 9 98 98 3 98 98 4 98 2 98 4
        // 2 1 1 9 2 4
        // a.add(4);
        // a.add(6);
        // a.add(5);
        // a.add(3);
        // a.add(3);
        // a.add(1);
        // System.out.println(pickingNumbers(a));
        String s = "4 2 3 4 4 9 98 98 3 3 3 4 2 98 1 98 98 1 1 4 98 2 98 3 9 9 3 1 4 1 98 9 9 2 9 4 2 2 9 98 4 98 1 3 4 9 1 98 98 4 2 3 98 98 1 99 9 98 98 3 98 98 4 98 2 98 4 2 1 1 9 2 4";
        String[] ss = s.split(" ");

        for (int i = 0; i < ss.length; i++) {
            a.add(Integer.valueOf(ss[i]));
        }

        // System.out.println(ss.length);

        System.out.println(pickingNumbers(a));

    }

}