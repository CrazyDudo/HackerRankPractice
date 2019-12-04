 
import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    //题目：2舍3入；与下一个5的倍数做差，结果小于3，进一位；若总分小于38则不变。
    //思路：1.判断是否小于38；2.小于返回，大于做差 3.判断差值，决定是否进位
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> finalGrades = new ArrayList<>();
        // Write your code here
        for (int i = 0; i < grades.size(); i++) {

            Integer grade = grades.get(i);

            if (grade < 38) {
                finalGrades.add(grade);
            } else {

                int x = ((grade / 5) + 1) * 5 - grade;

                if (x < 3) {
                    finalGrades.add(((grade / 5) + 1) * 5);
                } else {
                    finalGrades.add(grade);
                }


            }


        }

        return finalGrades;
    }

    public static void main(String[] strings) {

        List<Integer> list = new ArrayList<>();
        list.add(73);
        list.add(67);
        list.add(38);
        list.add(33);
        System.out.println(gradingStudents(list));
    }

}
