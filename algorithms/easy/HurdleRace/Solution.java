
public class Solution {
    // 链接:https://www.hackerrank.com/challenges/the-hurdle-race/problem
    // 概要:一组数据中，最大值，与给定值K的差
    // 思路:对数组排序，取最大值与K比较，若k大，则返回0，若K小，则返回差。

    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {

        int temp = height[0];

        for (int i = 0; i < height.length; i++) {
            if (height[i] > temp) {
                temp = height[i];
            }

        }


        System.out.println(temp);

        if (temp - k > 0) {

            return temp-k;

        } else {

            return 0;

        }

    }

    public static void main(String[] args) {
        // 4
        // 1 6 3 5 2

        int[] height = { 1, 6, 3, 5, 2 };
        System.out.println(hurdleRace(4, height));
    }

}