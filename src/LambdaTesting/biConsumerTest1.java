package LambdaTesting;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class biConsumerTest1 {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer = (a,b) -> System.out.println(a*b);
        biConsumer.accept(2,5);

        BiConsumer<Integer,Integer> biConsumer1 = (a,b) -> System.out.println(a+b);
        biConsumer1.accept(3,4);

        biConsumer.andThen(biConsumer1).accept(2,4);
    }
}
