package basic.java.clasic.inherit1;

/**
 * 필드는 선언된 변수 타입을 따라가고, 메소드는 생성된 인스턴스의 최종오버라이딩을 따라간다
 *
 * todo) 주의
 * 1. 오버라이딩 된 메소드가 실행될때 사용되는 변수는 해당 클래스의 변수를 따라감
 * 2. super 메소드를 사용할경우 가장 최종 오버라이드 메소드를 따라감
 * 3. 인스턴스에 print() 메소드가 있어서 선언변수의 클래스에 없다면 컴파일 에러
 * 4. I.super.print(); 는 직계 부모로만 부를 수 있다
 * 5. 인터페이스간 상속관계가 아닐때는 II.super.print(); 이런식으로 부를 수 있다
 */

public class Main {
    public static void main(String[] args) {
//        B b3 = (B) new A(); todo 부모 인스턴스를 자식변수에 못 담음 (ClassCastException)

//        A a = new A(); //case1
//        System.out.println(a.val);
//        a.print();
//        System.out.println(":::::::::::::::::::::::");

        A b1 = new B(); //case2
        System.out.println(b1.val); //todo 주의)
        b1.print();
        System.out.println(":::::::::::::::::::::::");

//        B b2 = new B(); //case3
//        System.out.println(b2.val);
//        b2.print();
//        System.out.println(":::::::::::::::::::::::");

//        A c1  = new C();
//        System.out.println(c1.val);
//        c1.print();
//        System.out.println(":::::::::::::::::::::::");

//        B c2  = new C();
//        System.out.println(c2.val);
//        c2.print();
//        System.out.println(":::::::::::::::::::::::");

//        I c3  = new C();
//        System.out.println(c3.val);
//        System.out.println(I.val.hashCode() == c3.val.hashCode());
//        c3.print();
//        System.out.println(":::::::::::::::::::::::");

//        A c4  = new C();
//        System.out.println(c4.val);
//        c4.print();
//        System.out.println(":::::::::::::::::::::::");

//        I z1  = new Z();
//        z1.print();
//        System.out.println(":::::::::::::::::::::::");

//        II z2  = new Z();
//        z2.print();
//        System.out.println(":::::::::::::::::::::::");





    }
}
