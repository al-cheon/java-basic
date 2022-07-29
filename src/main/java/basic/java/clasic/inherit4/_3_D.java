package basic.java.clasic.inherit4;

/**
 * 다중구현, 인터페이스에 같은 default 메소드로 구현되어 있다면 반드시 구현해줘야한다
 */
public class _3_D implements _0_Z, _1_A {
    public static void main(String[] args) {
        new _3_D().test();
    }

    @Override
    public void test() {
        _0_Z.super.test();
    }
}
