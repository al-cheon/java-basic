package basic.java.clasic.classinfo;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        // Class 객체를 얻는 방법
        Class c1 = new Card().getClass();
        Class c2 = Class.class;
//        Class c3 = Class.forName("Card");

        System.out.println(c2.getName());
        System.out.println(c2.toString());

        // 클래스 객체를 통해 객체를 생성하는 방법
        Card i1 = new Card();
        Card i2 = Card.class.newInstance();
    }
}

class Card {

}