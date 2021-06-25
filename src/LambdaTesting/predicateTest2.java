package LambdaTesting;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class predicateTest2 {
    public static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        usingCondition();
        System.out.println("***************************************");
        usingConditionWithoutStreams();
        System.out.println("***************************************");
        usingConsumerAndPredicate();
    }

    public static void usingCondition(){
        Predicate<Student> predicate = student -> student.getGradeLevel()>=3
                && student.getGender().equalsIgnoreCase("male");
        studentList.stream().filter(predicate).forEach(System.out::println);
    }

    public static void usingConditionWithoutStreams(){
        Predicate<Student> predicate = student -> student.getGradeLevel()>=3;
        studentList.forEach(
                student -> {
                    if (predicate.test(student))
                        System.out.println(student);
                }
        );
    }

    public static void usingConsumerAndPredicate(){
        Consumer<Student> consumer = student -> System.out.println("Name: "+student);
        Predicate<Student> predicate = student -> student.getGender().equalsIgnoreCase("male");
        Predicate<Student> predicate1 = student -> student.getGpa()>=3;
        studentList.forEach(student ->
        {
            if (predicate.and(predicate1).test(student)) {
                consumer.accept(student);
            }
        });
    }
}
