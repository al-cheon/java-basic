package basic.java.clasic.abstracts6;

public class InterfaceSample01Impl implements InterfaceSample01 {

    @Override
    public void print() {
        System.out.println("InterfaceSample01Impl");
    }

    @Override
    public int plus(int a, int b) {
        return InterfaceSample01.super.plus(a, b);
    }

}
