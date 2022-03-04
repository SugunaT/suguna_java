package Day8;

import java.util.function.*;

public class Predefined_functionalinterface {

    public static void main(String[] args) {
        Supplier<String> Supplier = () -> "Hello";

        System.out.println(Supplier.get());

        //Consumerinterface

        Consumer<Integer> Consumer = (s) -> System.out.println(s);
        Consumer.accept(6);

        //Functioninterface

        Function<Integer, Float> Function = (B) -> B.floatValue();
        System.out.println(Function.apply(7));

        //predicateinterface

        Predicate<String> Predicate = (B) -> B.length() == 5;

        System.out.println(Predicate.test("suguna"));

        //Biconsumer

        BiConsumer<String, String> biconsumer = (a, b) -> System.out.println((a.equals(b)));

        biconsumer.accept("Hello", "Hello");

        //Bifunction

        BiFunction<String, String, String> byfunction = (a, b) -> a + b;

        System.out.println(byfunction.apply("hello", "Everyone"));

        //Bipredicate

        BiPredicate<Integer, Integer> bipredicate = (a, b) -> a.equals(b);

        System.out.println(bipredicate.test(6, 6));
    }


}



