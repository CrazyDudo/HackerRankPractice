 
import java.io.IOException;

public class SimpleArraySum {

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        /*
         * Write your code here.
         */
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum = sum + ar[i];
        }
        return sum;
    }


    public static void main(String[] args) throws IOException {
        int[] arr = new int[]{1, 2, 3, 4, 10, 11};

        System.out.println(simpleArraySum(arr));
    }
}
