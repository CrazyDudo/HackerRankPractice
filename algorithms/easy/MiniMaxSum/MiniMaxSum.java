 

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {


    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        BigDecimal sum = new BigDecimal(0);
        BigDecimal temp;
        List<BigDecimal> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(new BigDecimal(arr[i]));
            temp = new BigDecimal(arr[i]);
            sum = sum.add(temp);
        }
        Collections.sort(list);
        System.out.println( sum.subtract(list.get(list.size()-1))+" "+ sum.subtract(list.get(0)));

    }

    public static void main(String[] s) {
        miniMaxSum(new int[]{256741038, 623958417, 467905213, 714532089, 938071625});
//        256741038 623958417 467905213 714532089 938071625

//        BigDecimal a = new BigDecimal(10);
//        BigDecimal b = new BigDecimal(3);
//        BigDecimal c = new BigDecimal(467905213);
//        BigDecimal d = new BigDecimal(714532089);
//        BigDecimal e = new BigDecimal(938071625);
//
//        System.out.println(e.add(d.add(c.add(b.add(a)))));

    }


}
