
public class Solution {
    // 链接:https://www.hackerrank.com/challenges/save-the-prisoner/problem
    // 概要:n个人，m块糖，从s起依次发，几号拿到最后一块
    // 思路:见代码

    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) {

        int result = 0;
        // m+s<=n,即一遍可以分发完成
        if ((m + s) <= n) {

            return m + s - 1;
        }
        // m+s>n,即大于一遍分发
        if ((m + s) > n) {
            // 到尾部完
            if ((m + s - 1) % n == 0) {

                result = n;
            } else {
                // 非尾部完
                result = (m + s - 1) % n;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        // n: an integer, the number of prisoners
        // m: an integer, the number of sweets
        // s: an integer, the chair number to begin passing out sweets from

        System.out.println(saveThePrisoner(3, 7, 3));

        System.out.println(saveThePrisoner(3, 6, 2));
        System.out.println(saveThePrisoner(352926151, 380324688, 94730870));
        System.out.println(saveThePrisoner(999999999, 999999999, 1));
        System.out.println(saveThePrisoner(499999999, 999999998, 2));

        System.out.println("---------------------");
        System.out.println(saveThePrisoner(7, 19, 2));
    }

}