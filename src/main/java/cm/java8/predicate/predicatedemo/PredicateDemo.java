package cm.java8.predicate.predicatedemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author adamhand
 */
public class PredicateDemo {
    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T s :  list) {
            if (p.test(s)) {
                result.add(s);
            }
        }
        return result;
    }
}

class Main {
    public static void main(String[] args) {
        Predicate<String> noneEmptyStringPredicate = (String s) -> (!s.isEmpty());
        List<String> noneEmpty = PredicateDemo.filter(Arrays.asList("a", "b", "c"),
                noneEmptyStringPredicate);

        noneEmpty.forEach(System.out::println);
    }
}
