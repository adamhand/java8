package cm.java8.predicate.functiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author adamhand
 */
public class FunctionDemo {
    public static <T, R>List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(f.apply(t));
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> l = map(
                Arrays.asList("lambdas", "in", "action"),
//                IDEA 提示Can be replaced with method reference less 可以用代码更少的方法引用代替
//                (String s) -> s.length()
                String::length
        );
        l.forEach(System.out::println);
    }
}
