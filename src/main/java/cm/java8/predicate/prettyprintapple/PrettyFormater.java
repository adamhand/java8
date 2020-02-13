package cm.java8.predicate.prettyprintapple;

import cm.java8.predicate.Apple;

import java.util.Arrays;
import java.util.List;

/**
 * @author adamhand
 */
public class PrettyFormater {
    public static void prettyPrintApple(List<Apple> inventory,
                                        AppleFormater formater) {
        for (Apple a : inventory) {
            String output = formater.accept(a);
            System.out.println(output);
        }
    }
}

class Main {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple("green", 100),
                new Apple("red", 200),
                new Apple("yellow", 150));

        PrettyFormater.prettyPrintApple(inventory, new AppleFancyFormater());
        PrettyFormater.prettyPrintApple(inventory, new AppleSimpleFormater());
    }
}
