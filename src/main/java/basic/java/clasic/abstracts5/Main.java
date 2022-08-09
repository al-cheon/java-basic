package basic.java.clasic.abstracts5;

/**
 * 다시 정리하지만
 * 필드는 참조변수를 따라가고, 메서드는 인스턴스를 따라간다
 */
public class Main {
    public static void main(String[] args) {

        B taget = new ImplA();

        taget.value();


    }
}
