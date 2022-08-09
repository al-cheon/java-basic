package basic.java.clasic.abstracts5;

public interface B extends A {

    String val = "B val";

    default void test() {
        System.out.println("test B");
    }

    default void value() {
        A.super.value();
        System.out.println("value ::" + val);
    }

}
