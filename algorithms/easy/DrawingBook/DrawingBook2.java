/**
 * DrawingBook
 */
public class DrawingBook2 {
    // https://www.hackerrank.com/challenges/drawing-book
    // 概要:一本书，从首页或尾页跳到指定页至少需要翻页几次。第一页在右侧，奇数页在右，偶数页在左边
    // 思路:
    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         * 
         */

        int start = p / 2;

        int end = 0;

        if (n % 2 == 1) {
            end = (n - p) / 2;

        } else {

            end = (int) Math.ceil((n - p) / 2.0);

        }

        return Math.min(start, end);
    }

    public static void main(String[] args) {
        pageCount(6, 5); // expect：1
        // pageCount(4, 4); // expect：0
        // pageCount(6, 3); // expect：1
        // pageCount(6, 4); // expect：1

        System.out.println(pageCount(6, 5));
    }

}