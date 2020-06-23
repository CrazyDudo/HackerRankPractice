
public class VeryBigSum {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long result = 0;
        for (int i = 0; i < ar.length; i++) {
            result = result + ar[i];
        }
        return result;
    }
    public static void main(String[] arg) {
        long[] arr = new long[]{1L, 2L};
        long l = aVeryBigSum(arr);
        System.out.println(l);
    } 
}
