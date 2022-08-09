package basic.java.clasic.abstracts5;

public class ImplB extends ImplA{
    public String val = "ImplB val";

    @Override
    public void value() {
        super.value();
        System.out.println("value ::" + val);
    }
}
