
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ElectronicsShop
 */
public class ElectronicsShop {

    /*
     * Complete the getMoneySpent function below.
     */

    // https://www.hackerrank.com/challenges/electronics-shop/problem
    // 概要：从两个数组中分别取一个元素，求其和与指定数之差最小的（和小于等于指定数）。返回，两数之和。
    // 思路：遍历求和，做差，比较
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        List<Integer> sumList = new ArrayList<>();
        int sum = 0;
        int gap = b;

        boolean isAffordable = false;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                sum = keyboards[i] + drives[j];
                if (b >= sum) {
                    isAffordable = true;
                }

                if (b >= sum && gap > b - sum) {
                    System.out.println("keyboard=" + keyboards[i] + "   drives=" + drives[j]);
                    sumList.add(sum);
                    gap = b - sum;
                }
            }
        }

        Collections.sort(sumList);
        System.out.println(isAffordable);
        return isAffordable ? sumList.get(sumList.size() - 1) : -1;
    }

    public static void main(String[] args) {
        // 10
        // 3 1
        // 5 2 8
        // Sample Output 9

        // int[] keyboards = { 3, 1 };
        // int[] drives = { 5, 2, 8 };
        // long result = getMoneySpent(keyboards, drives, 10);
        // System.out.println(result);

        // 572413 359082 441954 808540

        int[] keyboards = { 1, 2 };
        int[] drives = { 1, 2, 3 };
        int result = getMoneySpent(keyboards, drives, 2);
        System.out.println(result);
    }
}