 import java.util.ArrayList;
import java.util.List;
/**
 * BonAppetit
 */
public class BonAppetit {

    // https://www.hackerrank.com/challenges/bon-appetit
    // 概要:检查按规则求取list各个元素和是否正确
    // 思路:按规则求和，比对

    // Complete the bonAppetit function below.
    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        // k=>anna不用付款的索引，b=>anna 需要付款金额
        int annaExclude = bill.get(k);
        int sum = 0;
        for (Integer i : bill) {
            sum = sum + i;
        }
        sum = sum - annaExclude;
        // Complete the bonAppetit function in the editor below.
        // It should print Bon Appetit if the bill is fairly split.
        // Otherwise, it should print the integer amount of money that Brian owes Anna.
        if ((sum / 2) == b) {
            System.out.println("Bon Appetit");
        }
        if ((sum / 2) != b) {

            System.out.println(b-(sum / 2)  );
        }

    }

    public static void main(String[] args) {

        List<Integer> bill = new ArrayList<>();

        bill.add(2);
        bill.add(4);
        bill.add(6);

        bonAppetit(bill, 2, 3);

    }

}