package cm.java8.predicate.prettyprintapple;

import cm.java8.predicate.Apple;

public class AppleSimpleFormater implements AppleFormater {
    @Override
    public String accept(Apple apple) {
        return "An apple of " + apple.getWeight() + " g";
    }
}
