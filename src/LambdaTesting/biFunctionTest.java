package LambdaTesting;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class biFunctionTest {
    public static List<Student> list = StudentDataBase.getAllStudents();
    public static void main(String[] args) {
        usingBiFunction();
    }
    public static Predicate<Student> predicate = student -> student.getGender().equalsIgnoreCase("male");

    public static void usingBiFunction(){

        BiFunction<List<Student>, Predicate<Student>,List<Student> > biFunction = (students, studentPredicate) ->{
            List<Student> studentList = new ArrayList<>();
            students.forEach(
                    student -> {
                        if (studentPredicate.test(student))
                            studentList.add(student);
                    }
            );
            return studentList;
        } ;

        List<Student> studentList = biFunction.apply(list,predicate);
        studentList.forEach(System.out::println);
    }
}
