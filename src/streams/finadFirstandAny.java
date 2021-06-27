package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class finadFirstandAny {

    public static Optional<Student> findAnyStudentWithGPA(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()<3.8)
                .findAny();
    }

    public static Optional<Student> findFirstStudentWithGPA(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()<3.8)
                .findFirst();
    }

    public static void main(String[] args) {
        System.out.println(findFirstStudentWithGPA().get());
        System.out.println(findAnyStudentWithGPA().get());
    }
}
