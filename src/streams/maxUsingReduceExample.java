package streams;

import java.util.Arrays;
import java.util.List;

public class maxUsingReduceExample {

    public static void main(String[] args) {
        System.out.println(findMaxValue(Arrays.asList(1,2,3,4,5,11,2,34,54,1,2,3)));
        System.out.println(findMinValue(Arrays.asList(1,2,3,4,5,11,2,34,54,1,2,3)));
    }

    public static int findMaxValue(List<Integer> integerList){
        return integerList.stream().reduce(0,(x,y) -> x>y?x:y);
    }

    public static int findMinValue(List<Integer> integerList){
        return integerList.stream().reduce(integerList.get(0),(x,y) -> x<y?x:y);
    }
}
