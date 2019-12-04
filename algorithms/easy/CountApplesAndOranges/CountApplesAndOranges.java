 

public class CountApplesAndOranges {

    //    For example, Sam's house is between  and . The apple tree is located at  and the orange at . There are  apples and  oranges. Apples are thrown  units distance from , and  units distance. Adding each apple distance to the position of the tree, they land at . Oranges land at . One apple and two oranges land in the inclusive range  so we print
    //思路：
    //1，分别算出落地位置
    //2，判断是否在区间内
    //3，分别算出在区间内的个数
    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCount = 0;
        int orangesCount = 0;
        for (int i = 0; i < apples.length; i++) {
            int location = apples[i] + a;

            if (location <= t && location >= s) {
                appleCount++;
            }
        }

        for (int i = 0; i < oranges.length; i++) {
            int location = oranges[i] + b;
            if (location <= t && location >= s) {
                orangesCount++;
            }
        }

        System.out.println(appleCount);
        System.out.println(orangesCount);
    }


    public static void main(String[] a) {
//        7 11
//        5 15
//        3 2
//       -2 2 1
//        5 -6

        countApplesAndOranges(7, 11, 5, 15, new int[]{-2, 2, 1}, new int[]{5, -6});
    }

}
