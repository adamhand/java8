package cm.java8.predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author adamhand
 */
public class Apple {
    private String color;
    private int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }

    public static List<Apple> filterApple(List<Apple> inventory,
                                          Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();

        for (Apple a : inventory) {
            if (p.test(a)) {
                result.add(a);
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return getColor() + " : " + getWeight();
    }
}

class Main{
    public static void main(String[] args) {
        List<Apple> list = new ArrayList<>();
        list.add(new Apple("green", 100));
        list.add(new Apple("red", 200));
        list.add(new Apple("green", 200));

        Apple.filterApple(list, Apple::isGreenApple).forEach(System.out::println);
        Apple.filterApple(list, Apple::isHeavyApple).forEach(System.out::println);
    }
}
