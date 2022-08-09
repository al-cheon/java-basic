package basic.java.clasic.abstracts5;

public abstract class D extends C implements Z, A {
    public String val = "D val";

    @Override
    public void print() {
        System.out.println("print D");
    }

    @Override
    public void test() {
        System.out.println("test D");
    }

    @Override
    public void value() {
        super.value();
        Z.super.value();
        System.out.println("value ::" + val);
    }
}
