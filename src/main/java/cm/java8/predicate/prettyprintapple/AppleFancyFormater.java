package cm.java8.predicate.prettyprintapple;

import cm.java8.predicate.Apple;

public class AppleFancyFormater implements AppleFormater {
    @Override
    public String accept(Apple apple) {
        String s = apple.getWeight() > 150 ? "heavy" : "light";
        return "A " + s + " " + apple.getColor() + " apple";
    }
}
