 

public class Kangaroo {
//    Complete the function kangaroo in the editor below. It should return YES if they reach the same position at the same time, or NO if they don't.
//
//    kangaroo has the following parameter(s):
//
//    x1, v1: integers, starting position and jump distance for kangaroo 1
//    x2, v2: integers, starting position and jump distance for kangaroo 2
//x1,x2,v1,v2,均小于10000

    //思路：算出总路程，比较是否相等

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {

        int s1;
        int s2;

        String result = "NO";
        for (int i = 0; i < 10000; i++) {
            s1 = x1 + v1 * i;
            s2 = x2 + v2 * i;

            if (s1 == s2) {

                result = "YES";
            }

        }


        return result;
    }


    public static void main(String[] strings) {
        System.out.println(kangaroo(1, 3, 4, 3));
    }

}
