package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class reduceExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        System.out.println(performMultiplication(list));

        performGreatestGPA();
    }

    public static int performMultiplication(List<Integer> integerList){
        return integerList.stream()
                .reduce(1,(a,b)->a*b);
        // a is Accumulator.
        // 1 is Default Value.
        // b is Current Integer.
    }

    public static void performGreatestGPA(){
        List<Student> studentList = StudentDataBase.getAllStudents();

        Optional<Student> optionalStudent = studentList.stream()
                .reduce((a, b) -> a.getGpa()>b.getGpa()?a:b);

        if (optionalStudent.isPresent())
            System.out.println(optionalStudent.get());
    }
}
