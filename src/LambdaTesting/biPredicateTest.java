package LambdaTesting;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiPredicate;

public class biPredicateTest {
    public static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        usingBiTest();
    }

    public static void usingBiTest(){
        BiPredicate<Integer,Double> biPredicate = (a,b) -> a>3 && b>=3.7;
        studentList.forEach(
                student -> {
                    if (biPredicate.test(student.getGradeLevel(),student.getGpa()))
                        System.out.println(student);
                }
        );
    }
}
