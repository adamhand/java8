package cm.java8.lambda.methodrefrence;

public class Apple implements Fruit {
    private int weight;
    private String color;

    public Apple() {}

    public Apple(int weight) {
        this.weight = weight;
    }

    public Apple(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }
}
