package basic.java.clasic.inherit1;

public class A implements I {
    String val = "A";
    public void print() {
        System.out.println(val);
    }
}

class B extends A {
    String val = "B";
//    void print() {
//        System.out.println(val);
//    }
}

class C extends B {
    String val = "C";
    public void print() {
        super.print(); //todo 주의
        System.out.println(val);
    }
}

class Z implements I, II {
    @Override
    public void print() {
        I.super.print();
        II.super.print();
        System.out.println("Z");
    }
}

interface I {
    String val = "I";
    default void print() {
        System.out.println("I");
    }
}

interface II {
    default void print() {
        System.out.println("II");
    }
}
