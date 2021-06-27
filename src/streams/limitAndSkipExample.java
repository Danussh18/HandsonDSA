package streams;

import data.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class limitAndSkipExample {
    public static List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
    public static void main(String[] args) {
        findByLimit();
        System.out.println("******************************");
        findBySkip();

    }

    public static void findByLimit(){
        list.stream().limit(3).forEach(System.out::println);
    }

    public static void findBySkip(){
        list.stream().skip(3).forEach(System.out::println);
    }
}
