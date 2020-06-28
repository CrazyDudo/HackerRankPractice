import javafx.scene.CacheHint;

public class Solution {
    // 链接:https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
    // 概要:计算面积，长为字母数，宽为最高；
    // 思路:分别取word中每一个高度，比较取最高；取word长度；计算面积。

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
        char[] chars = word.toCharArray();

        String alphaString = "abcdefghijklmnopqrstuvwxyz";

        int temp = 0;

        for (int i = 0; i < chars.length; i++) {
            int index = alphaString.indexOf(chars[i]);

            if (h[index] > temp) {
                temp = h[index];
            }
        }

        System.out.println(temp);

        return temp * word.length();
    }

    public static void main(String[] args) {

        // 1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
        // abc

        int[] h = { 1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };

        System.out.println(designerPdfViewer(h, "zaba"));

    }

}