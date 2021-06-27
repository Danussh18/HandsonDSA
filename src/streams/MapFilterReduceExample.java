package streams;

import java.util.Arrays;
import java.util.List;

public class MapFilterReduceExample {

    public static void main(String[] args) {

        List<Integer> evenList = Arrays.asList(2,4,6,8,10,12,14,16,18,20);
        List<Integer> mixedList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println(evenList.stream().allMatch(x -> x%2==0));
        System.out.println(mixedList.stream().noneMatch(x->x%2==0));
        System.out.println(mixedList.stream().anyMatch(x -> x%2==0));
    }
}
