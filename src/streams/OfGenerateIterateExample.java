package streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class OfGenerateIterateExample {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Adam","Virat","Julie");
        stringStream.forEach(System.out::println);
        System.out.println("***************************************");

        Stream.iterate(0, x ->x+5).
                limit(180).forEach(System.out::println);
        System.out.println("****************************************");

        Supplier<Integer> supplier = new Random()::nextInt;

        Stream.generate(supplier).limit(9).forEach(System.out::println);
    }
}
