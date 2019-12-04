 
import java.util.Scanner;

public class Staircase {

    // Complete the staircase function below.
    static void staircase(int n) {

        for (int i = 0; i < n; i++) {
            StringBuffer hashtag = new StringBuffer();
            StringBuffer spaces = new StringBuffer();
            appendspace(n - i - 1, spaces);
            appendHashtag(i + 1, hashtag);
            System.out.println(spaces.append(hashtag));
        }

    }

    public static StringBuffer appendHashtag(int times, StringBuffer sb) {

        for (int i = 0; i < times; i++) {
            sb.append("#");
        }
        return sb;
    }

    public static StringBuffer appendspace(int times, StringBuffer sb) {

        for (int i = 0; i < times; i++) {
            sb.append(" ");
        }
        return sb;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
