
public class Solution {
    // 链接:https://www.hackerrank.com/challenges/magic-square-forming/problem
    // 概要:
    // 思路:

    public static int formingMagicSquare(int[][] s) {
        int cost = Integer.MAX_VALUE;
        int t[][] = { { 4, 9, 2, 3, 5, 7, 8, 1, 6 }, { 4, 3, 8, 9, 5, 1, 2, 7, 6 }, { 2, 9, 4, 7, 5, 3, 6, 1, 8 },
                { 2, 7, 6, 9, 5, 1, 4, 3, 8 }, { 8, 1, 6, 3, 5, 7, 4, 9, 2 }, { 8, 3, 4, 1, 5, 9, 6, 7, 2 },
                { 6, 7, 2, 1, 5, 9, 8, 3, 4 }, { 6, 1, 8, 7, 5, 3, 2, 9, 4 }, };
        int temp = 0;
        for (int i = 0; i < 8; i++) {
            temp = Math.abs(s[0][0] - t[i][0]) + Math.abs(s[0][1] - t[i][1]) + Math.abs(s[0][2] - t[i][2])
                    + Math.abs(s[1][0] - t[i][3]) + Math.abs(s[1][1] - t[i][4]) + Math.abs(s[1][2] - t[i][5])
                    + Math.abs(s[2][0] - t[i][6]) + Math.abs(s[2][1] - t[i][7]) + Math.abs(s[2][2] - t[i][8]);
            cost = temp < cost ? temp : cost;
        }
        return cost;

    }

    public static void main(String[] args) {
        int[][] s = new int[3][3];

        

        System.out.println(formingMagicSquare(s));
    }

}