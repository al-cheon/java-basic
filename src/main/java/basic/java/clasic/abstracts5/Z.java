package basic.java.clasic.abstracts5;

public interface Z {
    String val = "Z val";

    default void value() {
        System.out.println("value ::" + val);
    }

    default void value2() {
        System.out.println("value ::" + val);
    }

}
