package cm.java8.predicate.consumerdemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author adamhand
 */
public class ConsumerDemo {
    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T t : list) {
            c.accept(t);
        }
    }

    public static void main(String[] args) {
        forEach(
                Arrays.asList(1, 2, 3, 4, 5),
                // IDEA 提示Can be replaced with method reference less 可以用代码更少的方法引用代替
                // (Integer i) -> System.out.println(i)
                System.out::println
        );
    }
}
