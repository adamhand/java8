package cm.java8.demo2_1;

public class AppleRedHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150 &&
                "red".equals(apple.getColor());
    }
}
