package basic.java.clasic.abstracts5;

public abstract class C implements B{

    public String val = "C val";

    public void print() {
        System.out.println("print C");
    }

    @Override
    public void test() {
        System.out.println("test C");
    }

    @Override
    public void value() {
        B.super.value();
        System.out.println("value ::" + val);
    }
}
