package cm.java8.lambda.methodrefrence;

public class Orange implements Fruit {
    private String color;
    private int weight;

    public Orange(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Orange(String color) {
        this.color = color;
    }

    public Orange(int weight) {
        this.weight = weight;
    }
}
