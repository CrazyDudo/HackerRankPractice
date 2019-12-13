/**
 * DrawingBook
 */
public class DrawingBook {
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

        int count = 0;

        if (n - p == 0 || p == 1) {
            System.out.println(count);
            return count;
        } else {
            if (n - p >= p) {

                System.out.println("从头开始");
                count = p / 2;
                
            } else {
                System.out.println("从尾开始");

                if (n % 2 == 0) {
                    System.out.println("n是偶数");
                    count = ((n+1 - p) / 2);

                } else {

                    System.out.println("n是奇数");
                    count = (n - p) / 2;

                }

            }
        }

        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        pageCount(6, 5); // expect：1
        // pageCount(4, 4); // expect：0
        // pageCount(6, 3); // expect：1
        // pageCount(6, 4); // expect：1
    }

}