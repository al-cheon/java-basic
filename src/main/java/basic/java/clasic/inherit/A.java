package basic.java.clasic.inherit;

public class A {
    String val = "A";
    void print() {
        System.out.println(val);
    }
}

class B extends A {
    String val = "B";   //todo 주의) 조상변수와 같은 이름의 변수를 만듬
    String val2 = "B";

    void print() {
        System.out.println(val);
    }

}
