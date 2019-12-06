/**
 * DayOfProgrammer
 */
public class DayOfProgrammer {

    // https://www.hackerrank.com/challenges/day-of-the-programmer/problem
    // 概要:判断给定年份，中第256天，是几月几号；要求考闰年，两种日历闰年标准不同
    // 思路:判断是否问润年，再判断日期

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {

        if (year == 1918) {

            return "26.09.1918";
        }

        // 闰年
        if (year >= 1700 && year <= 1917) {

            if (year % 4 == 0) {
                return "12.09." + year;
            }

        }

        if (year % 400 == 0) {
            return "12.09." + year;
        }

        if (year % 4 == 0 && year % 100 != 0) {
            return "12.09." + year;
        }

        // 平年
        return "13.09." + year;
    }

    public static void main(String[] args) {

        System.out.println(dayOfProgrammer(1700));
    }

}