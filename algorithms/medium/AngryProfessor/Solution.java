
public class Solution {
    // 链接:https://www.hackerrank.com/challenges/angry-professor/problem
    // 概要:
    // 思路:见代码

    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {

        int onTimeCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                onTimeCount++;
            }

        }

        return onTimeCount >= k ? "NO" : "YES";
    }

    public static void main(String[] args) {

        // 4 3
        // -1 -3 4 2
    }

}