 

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class BetweenTwoSets {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    //2个int数组，a数组中每个元素都是n的因数，n是b数组中每个元素的因数，返回n的个数
    //思路：
    //1.找出a的小于等于b中最大数的所有公约数
    //2.找出b的所有因数
    //3.找出相同的

    //note：公式 i%num != 0

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        List<Integer> aFactor = new ArrayList<>();
        List<Integer> notAFactor = new ArrayList<>();

        Collections.sort(a);
        Collections.sort(b);
        int maxA = a.get(a.size() - 1);
        int minB = b.get(0);

        for (int i = maxA; i <= minB; i++) {
            for (int j = 0; j < a.size(); j++) {
                if (i % a.get(j) == 0) {
                    aFactor.add(i);
                } else {
                    notAFactor.add(i);
                }
            }
        }
        aFactor.removeAll(notAFactor);
        List<Integer> result = new ArrayList<>(new HashSet<>(aFactor));
        List<Integer> notFactorofB = new ArrayList<>();
        for (int i = 0; i < b.size(); i++) {
            for (int j = 0; j < result.size(); j++) {
                if (b.get(i) % result.get(j) != 0) {
                    notFactorofB.add(result.get(j));
                }
            }
        }
        result.removeAll(notFactorofB);
        System.out.println(result.size());
        return result.size();
    }

    public static void main(String[] s) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        //        2 4
//        16 32 96
        a.add(2);
        a.add(4);

        b.add(16);
        b.add(32);
        b.add(96);

        getTotalX(a, b);
    }


}
