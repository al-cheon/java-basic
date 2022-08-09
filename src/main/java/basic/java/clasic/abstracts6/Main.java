package basic.java.clasic.abstracts6;

public class Main {
    public static void main(String[] args) {
        InterfaceSample01 in = new InterfaceSample01Impl();
        in.print();
        in.plus(1, 2);
        InterfaceSample01.multiply(1, 2);

    }
}
