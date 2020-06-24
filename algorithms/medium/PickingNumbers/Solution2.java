import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution2 {
    // 链接:问题链接
    // 概要:
    // 思路:1.对原solution.java中，map按key排序；2.判断若两数（key)相邻，则对其value作和；3.对和排序，取最大。

    public static int pickingNumbers(List<Integer> a) {
        //最终结果
        int result;

        // 统计频次
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

        for (int i = 0; i < a.size(); i++) {
            if (map.containsKey(a.get(i))) {
                map.put(a.get(i), map.get(a.get(i)) + 1);

            } else {
                map.put(a.get(i), 1);
            }
        }

        System.out.println(map);

        // 判断若两数（key)相邻，则对其value作和

        Iterator iterator = map.keySet().iterator();

        List<Integer> keyList = new ArrayList<Integer>();

        while (iterator.hasNext()) {

            // key
            Integer key = (Integer) iterator.next();

            keyList.add(key);
        }

        // 按值排序

        List<Map.Entry<Integer, Integer>> valueList = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());

        System.out.println("keylist==" + keyList);

        List<Integer> sumList = new ArrayList<>();

        for (int i = 1; i < keyList.size(); i++) {

            if (keyList.get(i) - keyList.get(i - 1) == 1) {

                System.out.println("key==" + keyList.get(i));
                // 相邻两个value作和
                int s1 = map.get(keyList.get(i));
                int s2 = map.get(keyList.get(i - 1));
                sumList.add(s1 + s2);

            }

        }

        // 所有元素值相等情况
        if (keyList.size() == 1) {

            return a.size();
        }

        Collections.sort(sumList);
        int maxSum = sumList.get(sumList.size() - 1);

        // 单个元素频次，高于任意相邻两者频次和，取该单个元素频次
        // 根据value排序
        Collections.sort(valueList, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return (o2.getValue() - o1.getValue());
                // return (o1.getKey()).toString().compareTo(o2.getKey());
            }
        });
       

        int maxSingle = valueList.get(0).getValue();

        System.out.println("sum-single===" + maxSum + "--" + maxSingle);

        result = (maxSum > maxSingle) ? maxSum : maxSingle;

        return result;

    }

    public static void main(String[] args) {

        List a = new ArrayList<Integer>();

        // 4 6 5 3 3 1
        // 4 2 3 4 4 9 98 98 3 3 3 4 2 98 1 98 98 1 1 4 98 2 98 3 9 9 3 1 4 1 98 9 9 2 9
        // 4 2 2 9 98 4 98 1 3 4 9 1 98 98 4 2 3 98 98 1 99 9 98 98 3 98 98 4 98 2 98 4
        // 2 1 1 9 2 4
        a.add(4);
        a.add(6);
        a.add(5);
        a.add(7);
        a.add(7);
        a.add(7);
        a.add(3);
        a.add(3);
        a.add(1);
        // System.out.println(pickingNumbers(a));

        List b = new ArrayList<Integer>();

        // String s = "4 2 3 4 4 9 98 98 3 3 3 4 2 98 1 98 98 1 1 4 98 2 98 3 9 9 3 1 4
        // 1 98 9 9 2 9 4 2 2 9 98 4 98 1 3 4 9 1 98 98 4 2 3 98 98 1 99 9 98 98 3 98 98
        // 4 98 2 98 4 2 1 1 9 2 4";
        // String s="66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66
        // 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66
        // 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66
        // 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66
        // 66";
        
        // String s = "4 97 5 97 97 4 97 4 97 97 97 97 4 4 5 5 97 5 97 99 4 97 5 97 97 97 5 5 97 4 5 97 97 5 97 4 97 5 4 4 97 5 5 5 4 97 97 4 97 5 4 4 97 97 97 5 5 97 4 97 97 5 4 97 97 4 97 97 97 5 4 4 97 4 4 97 5 97 97 97 97 4 97 5 97 5 4 97 4 5 97 97 5 97 5 97 5 97 97 97";
        String s= "4 6 5 3 3 1";
        String[] ss = s.split(" ");

        for (int i = 0; i < ss.length; i++) {
            b.add(Integer.valueOf(ss[i]));
        }


        System.out.println(pickingNumbers(b));

    }

}