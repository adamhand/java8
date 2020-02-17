package cm.java8.lambda.demo1;

import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {
        Integer[] nums = {3, 2, 1};
//        Arrays.sort(nums, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });

        Arrays.sort(nums, (Integer o1, Integer o2) -> o1.compareTo(o2));

        Arrays.stream(nums).forEach(System.out::println);
    }
}
