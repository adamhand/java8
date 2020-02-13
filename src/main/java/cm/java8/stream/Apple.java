package cm.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * paralelleStream()方法确实比stream()方法快好几倍，运用了多核
 */

public class Apple {
    private int weight;

    public Apple(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }
}

class Main {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            inventory.add(new Apple(i));
        }

        long startTime = System.currentTimeMillis();
        List<Apple> heavyApples0 = inventory.stream().filter((Apple a) -> a.getWeight() > 150)
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        startTime = System.currentTimeMillis();
        heavyApples0 = inventory.parallelStream().filter((Apple a) -> a.getWeight() > 150)
                .collect(Collectors.toList());
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
