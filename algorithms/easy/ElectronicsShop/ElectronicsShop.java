import java.util.ArrayList;
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

        int sum = 0;

        int temp = 0;

        // 求和
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                sum = keyboards[i] + drives[j];

                if (b > sum && temp > b - sum) {
                    temp = b - sum;
                }
            }
        }

        System.out.println(temp);

        return 1;
    }

    public static void main(String[] args) {
        // 10
        // 3 1
        // 5 2 8
        // Sample Output 9

        int[] keyboards = { 3, 1 };
        int[] drives = { 5, 2, 8 };
        getMoneySpent(keyboards, drives, 10);

    }
}