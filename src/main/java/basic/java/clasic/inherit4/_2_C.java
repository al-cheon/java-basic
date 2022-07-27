package basic.java.clasic.inherit4;

/**
 * TODO 중요
 * case1. 인터페이스를 상속받을때, super 사용법
 * case2. 추상클래스를 상속받을때, super 사용법 (일반 클래스처럼 취급)
 * case3. 위 두 케이스를 여러 계층을 추가해서 마지막을 상속받을때
 */
public class _2_C implements  _2_B {
    @Override
    public void sample() {
        _2_B.super.sample();
        System.out.println("_2_C");
    }
}
