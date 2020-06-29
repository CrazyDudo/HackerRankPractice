public class Solution {
    // 链接:https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
    // 概要:数字翻转，整除
    // 思路:见代码

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {

        int count = 0;

        for (int x = i; x <= j; x++) {

            int reversedX = reverseNumber(x);

            if (Math.abs(reversedX - x) % k == 0) {
                count++;

            }

        }

        return count;

    }

    public static int reverseNumber(int num) {
        // 思路：字符串数组重组

        char[] chars = String.valueOf(num).toCharArray();
        char[] newChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {

            newChars[i] = chars[chars.length - i - 1];
        }

        return Integer.valueOf(String.valueOf(newChars)).intValue();

    }

    public static void main(String[] args) {
        // i: the starting day number
        // j: the ending day number
        // k: the divisor

        System.out.println(beautifulDays(20, 23, 6));

        // System.out.println(reverseNumber(234));
    }

}