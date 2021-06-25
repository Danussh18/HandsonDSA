package LambdaTesting;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;

public class functionTest {
    public static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void main(String[] args) {
//        usingFunction();
        usingListToMap();
    }

    public static void usingFunction(){
        Function<String,String> function1 = (a) -> a = a+", User";
        Function<String,String> function = (Name1) -> Name1.toUpperCase();
        System.out.println(function.andThen(function1).apply("Hello"));

    }

    public static void usingListToMap(){
        Function<List<Student>, Map<String,Double> > listMapFunction = students -> {
            HashMap<String,Double> hashMap = new HashMap<>();
            students.forEach(student -> hashMap.put( student.getName(),student.getGpa() ));
            return hashMap;
        };

        Map<String,Double> hashMap = listMapFunction.apply(studentList);

        hashMap.forEach((s, aDouble) -> System.out.println("Name: "+s+", GPA: "+aDouble));

    }
}
