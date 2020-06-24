import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Solution2 {
    // 链接:问题链接
    // 概要:
    // 思路:对Solution.java优化执行时间

    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        List<Integer> list = new ArrayList<>();

        int[] array = java.util.stream.IntStream.of(scores).distinct().toArray();
        int i = array.length - 1;
        for (int score : alice) {
            while (i >= 0) {
                if (score >= array[i])
                    i--;
                else {
                    list.add(i + 2);
                    break;
                }
            }
            if (i < 0)
                list.add(1);

        }

        int[] intArr = list.stream().mapToInt(Integer::valueOf).toArray();

        return intArr;
    }

    public static void main(String[] args) {
        // expect data:6,4,2,1
        int[] scores = { 100, 100, 50, 40, 40, 20, 10 };
        int[] alice = { 5, 25, 50, 120 };

        System.out.println(climbingLeaderboard(scores, alice));

    }

}