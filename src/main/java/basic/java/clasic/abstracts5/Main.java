package basic.java.clasic.abstracts5;

public class Main {
    public static void main(String[] args) {
//        A a1 = new A(); todo 추상클래스는 인스턴스화 할 수 없다
//        A a2 = new AA();
//        A a3 = new B();
        A a4 = new C();
        a4.Sample();
        System.out.println("========================");

        C c = new C();
        c.Sample();
        System.out.println("========================");
        // 위 두개 실행하면 같은 결과. 구현체를 따라간다

        new CC().Sample();
        System.out.println("========================");


        A aa1 = new BB();
        AA aa2 = new BB();
        aa2.aaa();
        System.out.println("========================");


    }


}
