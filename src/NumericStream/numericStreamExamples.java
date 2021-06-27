package NumericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class numericStreamExamples {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(sumOfNumbers(integerList));
        System.out.println("*********************************");
        System.out.println(sumOfNumbersUsingStreams());
        System.out.println("***********************************");
        intLongDoubleStream();
    }

    public static int sumOfNumbers(List<Integer> arrayList){
        return arrayList.stream().reduce(0,(x,y) -> x+y);
    }

    public static int sumOfNumbersUsingStreams(){
        return IntStream.range(1,9).sum();
    }

    public static void intLongDoubleStream(){
        IntStream intStream = IntStream.range(1,50);
        IntStream intStream1 = IntStream.rangeClosed(1,50);
        LongStream longStream = LongStream.range(1,50);

        intStream.forEach(System.out::println);
        System.out.println("*********************************");
        intStream1.forEach(System.out::println);
        System.out.println("*********************************");
        longStream.forEach(System.out::println);
        System.out.println("*********************************");

        IntStream.range(1,41).asDoubleStream().forEach(System.out::println);
        System.out.println("**********************************");
        System.out.println(IntStream.range(1,41).count());
    }


}
