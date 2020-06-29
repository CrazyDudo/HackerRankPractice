
public class Solution {
    // 链接:https://www.hackerrank.com/challenges/utopian-tree/problem
    // 概要:两个生长周期，每年春天，高度*2，夏天+1，算n个周期后总高度
    // 思路:见代码

    // Complete the utopianTree function below.
    static int utopianTree(int n) {

        int currentHeight = 1; // 树苗高度：1

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                currentHeight = currentHeight * 2;
            } else {
                currentHeight = currentHeight + 1;
            }

        }

        return currentHeight;
    }

    public static void main(String[] args) {

        // Period Height
        // 0 1
        // 1 2
        // 2 3
        // 3 6
        // 4 7
        // 5 14

        System.out.println(utopianTree(0));
        System.out.println(utopianTree(1));
        System.out.println(utopianTree(2));
        System.out.println(utopianTree(3));

    }

}