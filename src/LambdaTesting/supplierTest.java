package LambdaTesting;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class supplierTest {
    public static void main(String[] args) {
        Supplier<List<Student>> supplier = () -> StudentDataBase.getAllStudents();
        Consumer<List<Student>> consumer = (students -> System.out.println(students));

        consumer.accept(supplier.get());

    }
}
