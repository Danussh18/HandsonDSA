package MethodReference;

import data.Student;
import data.StudentDataBase;

import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class functionClassReference {
    public static Supplier<Student> supplier = () -> StudentDataBase.getStudent();
    public static void main(String[] args) {
        Function<String,String> function = (s -> s.toUpperCase(Locale.ROOT));
        Function<String,String> function1= String::toUpperCase;



        Consumer consumer = System.out::println;

        consumer.accept(function.apply("male"));
        consumer.accept(function1.apply("female"));

        consumer.accept(getByCondition());
    }

    public static boolean getByCondition(){
        return supplier.get().getGender().equalsIgnoreCase("male");
    }
}
