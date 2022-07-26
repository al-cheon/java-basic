package basic.java.clasic.inherit2;

public class Main2 {
    public static void main(String[] args) {
        A a = new B();
        B b = (B) a;
        b.hello();
        System.out.println("==================");
//        B a1 = (B) new A(); todo 주의) 부모 인스턴스는 자식에 캐스팅하더라도 넣을 수 없음. 이런식으로 하면 checked 에러로 찾지도 못함.

        B b1 = new B();
        b1.name = "bbb";
        System.out.println(b.name);
        System.out.println(b.getName());

    }
}

class A {
    String name;
}

class B extends A {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void hello() {
        System.out.println("hello");
    }
}