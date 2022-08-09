package basic.java.clasic.inherit2;

public class Main2 {
    public static void main(String[] args) {
        A a = new B();
        B b = (B) a;
        b.hello();
        System.out.println("==================");
//        B a1 = (B) new A(); todo 주의) 부모 인스턴스는 자식에 캐스팅하더라도 넣을 수 없음. 이런식으로 하면 checked 에러로 찾지도 못함.

        A b1 = new B();
        B b2 = new B();
//        b1.name = "first";
//        b2.name = "second";
        System.out.println(b1.name);
        System.out.println(b2.name);

    }
}

class A {
    String name = "A";
}

class B extends A {
    String name = "B";

    void hello() {
        System.out.println("hello");
    }
}