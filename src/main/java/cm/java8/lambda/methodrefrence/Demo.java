package cm.java8.lambda.methodrefrence;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
//        Supplier<Apple> supplier = Apple::new;
//        Apple apple =  supplier.get();

//        Supplier<Apple> supplier = () -> new Apple();
//        Apple apple = supplier.get();

//        Function<Integer, Apple> function = Apple::new;
//        Apple apple = function.apply(150);

//        Function<Integer, Apple> function = (weight) -> new Apple(weight);
//        Apple apple = function.apply(150);
//        System.out.println(apple);

//        List<Integer> weights = Arrays.asList(100, 200, 150, 230);
//        List<Apple> apples = map(weights, Apple::new);
//        apples.forEach(System.out::println);

//        BiFunction<Integer, String, Apple> biFunction = Apple::new;
//        Apple apple = biFunction.apply(100, "green");

        System.out.println(giveMeFruit("orange", 300));
    }

//    public static List<Apple> map(List<Integer> list, Function<Integer, Apple> f) {
//        List<Apple> result = new ArrayList<>();
//        for (Integer w : list) {
//            result.add(f.apply(w));
//        }
//        return result;
//    }

    static Map<String, Function<Integer, Fruit>> map = new HashMap<>();
    static {
        map.put("apple", Apple::new);
        map.put("orange", Orange::new);
    }

    public static Fruit giveMeFruit(String fruit, Integer weight) {
        return map.get(fruit.toLowerCase())
                .apply(weight);
    }
}
