package basic.java.clasic.abstracts5;

public class ImplA extends D {
    public String val = "ImplA val";

    @Override
    public void value() {
        super.value();
        System.out.println("value ::" + val);
    }
}
