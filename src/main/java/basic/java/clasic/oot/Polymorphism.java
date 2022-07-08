package basic.java.clasic.oot;

/**
 * 다형성
 * <img src="/img/extends_001.jpg">
 */
public class Polymorphism {

    public static void main(String[] args) {
        PolyA aa = new PolyB();
        PolyB bb = new PolyB();
        aa.method();
        bb.method();
    }

    //참조변수가 조상이고 객체가 자손이면 받을 수 있다
    PolyA polyA2 = new PolyB();
    //위를 실제론 아래처럼 캐스팅 한것을 생략한 것이다
    PolyB polyB = new PolyB();
    PolyA polyA3 = (PolyA) new PolyB();

    //Todo 반대로 자손 참조변수에 조상을 담을 수 없다 :: ClassCastException
//    PolyB error = new PolyA();

}


class PolyA {
    String aaa;
    void method() {
        System.out.println("AAAAAAAAAA");
    }
}

class PolyB extends PolyA{
    void method() {
        System.out.println("BBBBBBBBBB");
    }
}