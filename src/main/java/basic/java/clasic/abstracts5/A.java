package basic.java.clasic.abstracts5;

public interface A {

    static final String val = "A val";

    default void test() {
        System.out.println("test A");
    }

    default void value() {
        System.out.println("value ::" + val);
    }

}
