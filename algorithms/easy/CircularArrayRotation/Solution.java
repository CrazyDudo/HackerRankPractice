
public class Solution {
    // 链接:https://www.hackerrank.com/challenges/circular-array-rotation/problem
    // 概要:数组a，旋转k次，打印数组queries对应索引值。
    // 旋转：数组最后一个元素，放到第一位。
    // 思路:

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(final int[] a, final int k, final int[] queries) {

        int rotationTimes = k;
        final int length = a.length;

        if (k > length) {
            rotationTimes = k % length;
        }

        final int[] temp = new int[length];

        // 旋转
        System.arraycopy(a, length - rotationTimes, temp, 0, rotationTimes);

        System.arraycopy(a, 0, temp, rotationTimes, length - rotationTimes);

        // 打印

        int[] results = new int[queries.length];

        for (int i = 0; i < results.length; i++) {
            results[i] = temp[queries[i]];
            System.out.println(results[i]);
        }

        return results;
    }

    public static void main(final String[] args) {

        // 3 2 3
        // 1 2 3

        final int[] a = { 1, 2, 3 };
        final int k = 2;
        final int[] q = { 0, 1, 2 };
        circularArrayRotation(a, k, q);

        int[] temp = new int[3];
        // System.arraycopy(src, srcPos, dest, destPos, length);
        // System.arraycopy(a, 1, temp, 1, 2);

        // for (int i = 0; i < temp.length; i++) {
        // System.out.println(temp[i]);
        // }

    }

}
