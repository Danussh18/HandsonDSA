package streams;

import data.Student;
import data.StudentDataBase;

import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

public class mapExample {

    public static List<Student> studentList = StudentDataBase.getAllStudents();
    public static void main(String[] args) {
        setOfStudents();
    }

    public static void setOfStudents(){
        Set<String> setStudent = studentList.stream()
                .map(student -> student.getName())
                .map(student -> student.toLowerCase(Locale.ROOT))
                .collect(Collectors.toSet());

        setStudent.forEach(System.out::println);
    }

    public static void listOfStudents(){
        List<String> list =studentList.stream()
                .map(student -> student.getName())
                .map(student -> student.toUpperCase(Locale.ROOT))
                .collect(Collectors.toList());
        list.stream().forEach(System.out::println);
    }

//    public static void distinctActivities(){
//       studentList.stream()
//               .map(student -> student.getActivities())
//               .map(strings -> strings
//                               .stream()
//                       .collect(Collectors.toList()))
//               .map(strings -> )
//
//    }


}
