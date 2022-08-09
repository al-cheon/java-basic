package basic.java.clasic.abstracts6;

public interface InterfaceSample01 {

    final static String STATIC_VAL = "static";

    public abstract void print();

    default public int plus(int a, int b) {
        return a + b;
    }

    static public int multiply(int a, int b) {
        return a * b;
    }


}

