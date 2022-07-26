package basic.java.clasic.abstracts5;

public class BB extends AA {
    @Override
    protected void bbb() {
        System.out.println("bbb");
    }

    //todo 서브클래스의 구현체의 접근제어자는 더 넓은 범위로 설정 가능
    @Override
    public void ccc() {
    }
}
