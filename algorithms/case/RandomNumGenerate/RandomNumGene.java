import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import java.util.*;

/**
 * 需求：随机生成特定个不重复的随机数，在键盘显示;
 * 
 * 描述：软键盘输入密码时，需要每次改变数字布局。
 * 
 */
public class RandomNumGene {

    public static void main(String[] args) {

        // System.out.println(getRandomNum());
        System.out.println(GeneRandomV2());

    }

    // sm-sdk现用思路
    // 思路1：当set.size()小于10，不断生成小于10的随机数，用LinkedHashSet特性去重。
    public static String getRandomNum() {
        Random random = new Random();
        Set<Integer> set = new LinkedHashSet<>();
        while (set.size() < 10) {
            set.add(random.nextInt(10));
        }
        StringBuilder sb = new StringBuilder();
        for (Integer num : set) {
            sb.append(num);
        }
        return sb.toString();
    }

    // 思路2：
    // 1，先填充所需数据list,如0-9十个数字
    // 2，在list.size()范围产生随机数，作为索引，从list中取出记录并移除;
    // 3，然后再取小于9（list.size()-1）的随机数，以此类推；最终生成10个。

    public static String GeneRandomV2() {

        List list = new ArrayList();

        for (int i = 0; i < 10; i++) {

            list.add(i);
        }

        Random random = new Random();

        StringBuilder sb = new StringBuilder();

        while (list.size() > 0) {

            int index = random.nextInt(list.size());

            sb.append(list.get(index));

            list.remove(index);

        }

        return sb.toString();
    }

}