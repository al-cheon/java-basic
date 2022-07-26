package basic.java.clasic.inherit;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        A b1 = new B();
        B b2 = new B();
//        B b3 = (B) new A(); todo 부모 인스턴스를 자식변수에 못 담음

        System.out.println(a.val);
        System.out.println(b1.val); //todo 주의) 같은 변수 두개가 중복될경우 조상을 따르는 듯
        System.out.println(b2.val);

        a.print();
        b1.print();
        b2.print();


        if (a instanceof B) {
            System.out.println("a instanceof B");
        }
        if (b1 instanceof B) {
            System.out.println("b1 instanceof B");
        }

    }
}
