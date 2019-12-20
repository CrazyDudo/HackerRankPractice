/**
 * CountingValleys
 */
public class CountingValleys {
    // https://www.hackerrank.com/challenges/counting-valleys/problem
    // 概要:统计徒步路径中“山谷”个数
    // 思路:出发点为原点，如果非水平面下，且累计位置在“下坡”
    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

        int valleys = 0;
        boolean belowZero = false;
        int level = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'U') {
                // 上坡
                level++;
            } else {
                // 下坡
                level--;
            }

            if (!belowZero && level < 0) {
                valleys++;
                belowZero = true;
            }

            if (level >= 0) {
                belowZero = false;
            }

        }

        System.out.println(valleys);
        return valleys;
    }

    public static void main(String[] args) {

        // Sample Input
        // 8
        // UDDDUDUU
        // Sample Output
        // 1

        countingValleys(8, "UDDDUDUU");

    }

}
