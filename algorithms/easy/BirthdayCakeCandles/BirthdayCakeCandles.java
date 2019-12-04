 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {

    //题目：一组int数组中，最大值的个数
    //count max number
    //思路：
    //1，排序
    //2，取最大
    //3，遍历数组并比较，如果与最大值相等则计数器加一

    static int birthdayCakeCandles(int[] ar) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < ar.length; i++) {
            list.add(ar[i]);
        }
        Collections.sort(list);

        Integer max = list.get(ar.length - 1);
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            //此处要用equals,不可用双等号
            if (max.equals(list.get(i))) {
                count++;
            }

        }

        return count;
    }

    public static void main(String[] strings) {

        System.out.println("result=" + birthdayCakeCandles(new int[]{8759926, 8759926, 8759921, 8759926}));

    }
}

