package basic.java.clasic.lambda;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        /**
         * Consumer
         */
        Consumer<String> consumer = str -> {
            System.out.println(str);
        };
        consumer.accept("Hello World");

        /**
         * Supplier
         */
        Supplier supplier1 = new SupplierImpl(); //case1
        Supplier supplier2 = () -> { //case2
            return Math.random();
        };
        Supplier supplier3 = Math::random; //case3 : 가장 발전된 형태
        System.out.println(supplier3.get());

        /**
         * Predicate
         */
        Predicate<String> predicate = (str) -> {
            return str.contains("a");
        };
        System.out.println(predicate.test("abc"));

        /**
         * Function
         */
        Function<String, String[]> function = str -> {
            return str.split("");
        };
        Arrays.stream(function.apply("Hello World")).forEach(System.out::print);





    }
}

class SupplierImpl implements Supplier {
    @Override
    public Object get() {
        return Math.random();
    }
}