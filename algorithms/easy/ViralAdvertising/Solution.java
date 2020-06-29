
public class Solution {
    // 链接:https://www.hackerrank.com/challenges/strange-advertising/problem
    // 概要:返回n天时候的总量
    // 思路:见代码

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        // 开始值：5
        // 每次一半人分，每人分享给三人

        int count = 0;

        int currentUser = 5;

        for (int i = 0; i < n; i++) {
            count = count + (currentUser / 2);
            currentUser = (currentUser / 2) * 3;
        }

        return count;
    }

    public static void main(String[] args) {

        // Day Shared Liked Cumulative
        // 1 5 2 2
        // 2 6 3 5
        // 3 9 4 9
        // 4 12 6 15
        // 5 18 9 24

        System.out.println(viralAdvertising(4));
    }

}