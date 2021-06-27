package NumericStream;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class numericStreamAggregateExamples {
    public static void main(String[] args) {
        int res = IntStream.rangeClosed(1,100).sum();
        System.out.println("res is: "+res);

        OptionalInt optionalInt = IntStream.rangeClosed(1,50).max();
        System.out.print("Max value is: ");
        if (optionalInt.isPresent())
            System.out.println(optionalInt.getAsInt());
        else
            System.out.print("Int doesnt Exist");


    }
}
