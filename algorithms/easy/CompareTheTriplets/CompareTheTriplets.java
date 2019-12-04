

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);

        List<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(6);
        b.add(10);
        List<Integer> integers = compareTriplets(a, b);
        System.out.println(integers);
    }

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                sumA = sumA + 1;
            }
            if (a.get(i) < b.get(i)) {
                sumB = sumB + 1;
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(sumA);
        result.add(sumB);
        return result;
    }

}
