import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    // 链接:https://www.hackerrank.com/challenges/climbing-the-leaderboard
    // 概要:数组A每个元素，分别在数组B中的排名（Dense Ranking）
    // 思路:去重，排序，分别比较
    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        List<Integer> rankList = new ArrayList<Integer>();

        // 去重
        List<Integer> scoresList = new ArrayList<Integer>();

        for (int i = 0; i < scores.length; i++) {
            if (!scoresList.contains(scores[i])) {
                scoresList.add(scores[i]);

            }
        }

        for (int i = 0; i < alice.length; i++) {
            if (scoresList.contains(alice[i])) {
                // 如果有相同分数
                Collections.sort(scoresList);
                Collections.reverse(scoresList);
                rankList.add(scoresList.indexOf(alice[i]) + 1);

                System.out.println("same==" + scoresList.indexOf(alice[i]));

            } else {
                scoresList.add(alice[i]);
                Collections.sort(scoresList);
                Collections.reverse(scoresList);
                rankList.add(scoresList.indexOf(alice[i]) + 1);
                System.out.println("dif==" + scoresList.indexOf(alice[i]));
                scoresList.remove(scoresList.indexOf(alice[i]));
            }
        }

        // scoresList.indexOf()
        System.out.println("rank==" + rankList);
        System.out.println("score" + scoresList);

        int[] rankArray = new int[rankList.size()];

        for (int i = 0; i < rankArray.length; i++) {
            rankArray[i] = rankList.get(i).intValue();
        }

        return rankArray;
    }

    public static void main(String[] args) {
        // expect data:6,4,2,1
        int[] scores = { 100, 100, 50, 40, 40, 20, 10 };
        int[] alice = { 5, 25, 50, 120 };

        System.out.println(climbingLeaderboard(scores, alice));

    }

}