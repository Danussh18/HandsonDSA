package LambdaTesting;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicateTest1 {
    public static Predicate<Integer> predicate  = x -> x%2 == 0;
    public static Predicate<Integer> predicate1 = x -> x%5 == 0;
    public static Predicate<Integer> predicate2 = x -> x%3 == 0;

    public static List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);


    public static void main(String[] args) {
        list.stream().filter(predicate).forEach(System.out::println);
        System.out.println("******************************************************");
        usingAnd();
        System.out.println("******************************************************");
        usingOr();
        System.out.println("******************************************************");
        usingNegate();
    }

    public static void usingAnd(){
        list.stream().filter(predicate.and(predicate1)).forEach(System.out::println);
    }

    public static void usingOr(){
        list.stream().filter(predicate.or(predicate2)).forEach(System.out::println);
    }

    public static void usingNegate(){
        list.stream().filter(predicate.or(predicate2).negate()).forEach(System.out::println);
    }

}
