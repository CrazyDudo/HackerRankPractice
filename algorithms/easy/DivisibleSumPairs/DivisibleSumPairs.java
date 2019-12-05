
    // 0.https://www.hackerrank.com/challenges/divisible-sum-pairs
    // 1. 概要:一组整数组中，两数之和能整除指定数
    // 2. 思路:循环遍历，求和，并判断是否能整除
     
public class DivisibleSumPairs {


    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {

        int sum = 0;
        int count = 0;
         
        for (int i = 0; i < ar.length-1; i++) {
            for (int j = 1; j < ar.length; j++) {
                sum = ar[i]+ar[j];
                
                if (sum%k==0&&j>i) {
                    System.out.println(i+"--"+j);
                    
                     count++;
                }

            }
        }

        System.out.println(count);

        return count;

    }

    
    
    public static void main(String[] args) {
        
        // 6 3
        // 1 3 2 6 1 2

        divisibleSumPairs(6, 3, new int[] {1, 3, 2, 6, 1, 2});

        
    }


}