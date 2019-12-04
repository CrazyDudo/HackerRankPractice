 

import java.text.DecimalFormat;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        int positiveNum = 0;
        int nagetiveNum = 0;

        int zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveNum = positiveNum + 1;
            }
            if (arr[i] < 0) {
                nagetiveNum = nagetiveNum + 1;
            }
            if (arr[i] == 0) {
                zero = zero + 1;
            }
        }
        int total = positiveNum + nagetiveNum + zero;
        double positiveShare = ((double) positiveNum / total);
        double nagetiveShare = ((double) nagetiveNum / total);
        double zeroeShare = ((double) zero / total);
        DecimalFormat df = new DecimalFormat("0.000000");
        String positiveShares = df.format(positiveShare);
        String nagetiveShares = df.format(nagetiveShare);
        String zeroeShares = df.format(zeroeShare);

        System.out.println(positiveShares);
        System.out.println(nagetiveShares);
        System.out.println(zeroeShares);
    }

    public static void main(String[] strings) {
        int[] arr = {1, -2, 0};
        plusMinus(arr);
    }


}
