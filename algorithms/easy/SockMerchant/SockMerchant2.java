import java.util.HashMap;

/**
 * SockMerchant
 */
public class SockMerchant2 {

    // https://www.hackerrank.com/challenges/sock-merchant
    // 概要：一组整数中，相同的两个为一组（元素不可复用），求共有多少组
    // 思路：遍历比对，配对后剔除，同时计数器加一

    // sockMerchant has the following parameter(s):

    // n: the number of socks in the pile
    // ar: the colors of each sock

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        HashMap colorTypes = new HashMap<Integer, Integer>();

        int count = 0;
        for (int i = 0; i < n; i++) {

            int color = ar[i];
            if (colorTypes.containsKey(color) && colorTypes.get(color).equals(1)) {

                System.out.println(ar[i]);
                colorTypes.put(color, 0);
                count++;
                continue;
            }

            colorTypes.put(color, 1);

        }

        System.out.println(count);

        return count;

    }

    public static void main(String[] args) {
        int[] ar = { 1, 2, 1, 2, 5, 2 };
        sockMerchant(6, ar);

    }
}