 

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int leftToRight = 0;
        int rightToLeft = 0;
//        leftToRight = arr.get(0).get(0) + arr.get(1).get(1) + arr.get(2).get(2);
//        rightToLeft = arr.get(0).get(2) + arr.get(1).get(1) + arr.get(2).get(0);
        int j = arr.size();
        for (int i = 0; i < arr.size(); i++) {
            j--;
            leftToRight = leftToRight + arr.get(i).get(i);
            rightToLeft = rightToLeft + arr.get(i).get(j);
        }

        int result = leftToRight - rightToLeft;

        return Math.abs(result);
    }

    public static void main(String[] arg) {

//        11 2 4
//        4 5 6
//        10 8 -1

        List<List<Integer>> arr = new ArrayList<>();


        System.out.println();

    }
}
