package LambdaTesting;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class unaryOperatorTest {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = integer -> integer/3;
        Consumer<Integer> consumer = unaryOperator1 -> System.out.println(unaryOperator1);
        consumer.accept(unaryOperator.apply(6));


        Comparator<Integer> comparator = (x,y) ->x.compareTo(y);
        //BinaryOperator -> If input and output types are same.
        BinaryOperator<Integer> binaryOperator = BinaryOperator.maxBy(comparator);
        consumer.accept(binaryOperator.apply(4,9));

        BinaryOperator<Integer> binaryOperator1 = BinaryOperator.minBy(comparator);
        consumer.accept(binaryOperator1.apply(4,9));
    }
}
