package LambdaTesting;

import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println(comparator.compare(1,2));

        Comparator<Integer> comparator1 = (a,b) -> a.compareTo(b);

        System.out.println(comparator1.compare(2,1));
    }

}
