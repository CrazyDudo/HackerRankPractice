 

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */

    //    Sample Input
    //            07:05:45PM
    //    Sample Output
    //            19:05:45
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        //思路：
        //判断包含A或P
        //A不变，P则，时加12
        String hours = s.substring(0, 2);
        String others = s.substring(2, s.length() - 2);
        Integer h = Integer.valueOf(hours);
        if (s.contains("P")) {
            if (hours.equals("12")) {
                return String.valueOf(("12") + others);
            }
            return String.valueOf((h + 12) + others);
        }

        if (s.contains("A")) {
            if (hours.equals("12")) {

                return String.valueOf(("00") + others);
            }
            return s.substring(0, s.length() - 2);
        }
        return "error";
    }

    public static void main(String[] strings) {
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("07:05:45AM"));
        System.out.println(timeConversion("12:05:45AM"));
        System.out.println(timeConversion("12:05:45PM"));
    }
}

