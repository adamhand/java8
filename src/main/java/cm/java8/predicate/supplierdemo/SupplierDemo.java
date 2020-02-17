package cm.java8.predicate.supplierdemo;

import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class SupplierDemo {

    private static String getString(Supplier<String> stringSupplier) {
        return stringSupplier.get();
    }

    public static void main(String[] args) {
        Supplier<String> supplier = () -> new String("adamhand");
        System.out.println(supplier.get());

        System.out.println(
                getString(() -> "hello" + " world")
        );
    }
}
