package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class streamsExample {
    public static void main(String[] args) {
        Predicate<Student> predicate = student -> {
            return (student.getActivities().contains("football"));
        };

        Map<String, List<String>> map = StudentDataBase.getAllStudents()
                .stream()
                .filter(predicate)
                .collect(Collectors.toMap
                        (Student::getName,Student::getActivities));

        map.forEach(streamsExample::accept);

    }

    private static void accept(String k, List<String> v) {
        System.out.println("Name is: "+k+", Activities are: "+v);
    }
}
