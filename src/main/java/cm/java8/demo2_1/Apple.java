package cm.java8.demo2_1;

import cm.java8.App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Apple {
    public String color;
    public int weight;

    Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    private static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    private static List<Apple> filterHeavyApples(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    private static List<Apple> filterApplesByColor(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (color.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return getColor() + " : " + getWeight();
    }

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple("green", 130),
                new Apple("red", 300));

        List<Apple> result = Apple.filterGreenApples(inventory);
        result.forEach(System.out::println);

        Apple.filterHeavyApples(inventory, 300).forEach(System.out::println);
    }
}
