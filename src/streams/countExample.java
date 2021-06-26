package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;

public class countExample {
    public static List<Student> list = StudentDataBase.getAllStudents();
    public static void main(String[] args) {
        System.out.println(getStudentActivitiesCount());
    }

    public static long getStudentActivitiesCount(){
        return list.stream()
                .map(student -> student.getActivities())
                .flatMap(List::stream)
                .distinct()
                .count();
    }
}
