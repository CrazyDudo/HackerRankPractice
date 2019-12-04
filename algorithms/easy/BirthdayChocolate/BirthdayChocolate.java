import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/**
 * BirthdayChocolate
 */
public class BirthdayChocolate {

    /**
     * https://www.hackerrank.com/challenges/the-birthday-bar/
     * 概要:一组数据，求符合相邻m个数字和为d的个数； 
     * 思路：m个确定，从头试一遍
     */

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {

        int count = 0;
        if (s.size() == 1 && s.get(0) == d && m == 1) {
            // 4
            // 4 1
            count = 1;
            return count;
        }

        for (int i = 0; i < s.size() - m + 1; i++) {

            if (listSum(s.subList(i, i + m)) != d) {

                continue;
            }

            count++;

        }

        return count;
    }

    /**
     * 返回List<Integer>中所有元素之和
     * 
     * @param list
     * @return
     */
    public static int listSum(List<Integer> list) {
        int sum = 0;
        for (int temp : list) {
            sum = sum + temp;
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(1);

        // 2 5 1 3 4 4 3 5 1 1 2 1 4 1 3 3 4 2 1
        // 18 7

        // System.out.println(listSum(list));

        // test data
        // 1 2 1 3 2
        // 3 2

        List<Integer> listA = new ArrayList<>();

        listA.add(4);
        // System.out.println(birthday(list, 18, 7));
        System.out.println(birthday(listA, 4, 1));
    }

}