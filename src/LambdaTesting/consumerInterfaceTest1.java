package LambdaTesting;

import java.util.function.Consumer;

public class consumerInterfaceTest1 {

    public static void main(String[] args) {
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        consumer.accept(2);

        Consumer<Integer> consumer1 = (a) -> System.out.println("a is : "+a);

        consumer1.accept(333);
    }



}
