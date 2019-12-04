 

/**
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records
 * 问题概要：统计一组数据，超过历史最大和最小次数
 * 思路：遍历比较
 */
public class BreakingtheRecords {
    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {

        int tempMax = scores[0];
        int tempMin = scores[0];

        int countBreak = 0;
        int countWores = 0;

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] == tempMax || scores[i] == tempMin) {
                continue;
            }

            if (scores[i] > tempMax) {
                tempMax = scores[i];
                countBreak++;
            }

            if (scores[i] < tempMin) {
                tempMin = scores[i];
                countWores++;
            }

        }

        System.out.println(countBreak);
        System.out.println(countWores);

        return new int[]{countBreak,countWores};
    }


    public static void main(String[] strings) {

//        breakingRecords(new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1});
        breakingRecords(new int[]{3, 4 ,21, 36 ,10, 28 ,35 ,5 ,24, 42});
    }
}
