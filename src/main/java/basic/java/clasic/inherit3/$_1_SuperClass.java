package basic.java.clasic.inherit3;

public interface $_1_SuperClass {
    //서브클래스들이 공통으로 사용하는 메소드
    public abstract void common();
    //서브클래스별로 다르게 사용하는 메소드
    public abstract void individual();

    default void sample() {
        System.out.println("$_1_SuperClass");
    }
}
