package LambdaTesting;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class consumerTest2 {
    public static void main(String[] args) {

        //1
        StudentDataBase studentDataBase = new StudentDataBase();
        Consumer<Student> studentConsumer = (student -> System.out.println(student));
        List<Student> studentList = studentDataBase.getAllStudents();
        studentList.stream().forEach(studentConsumer);
    }
}
