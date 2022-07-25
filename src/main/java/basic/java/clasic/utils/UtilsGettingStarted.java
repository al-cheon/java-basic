package basic.java.clasic.utils;

/**
 * 클래스 객체를 활용하면 보다 동적인 코드를 작성할 수 있데..
 */
public class UtilsGettingStarted {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        //Class 객체를 얻는 3가지 방법
        Class<? extends Card> aClass = new Card().getClass(); //case1.
        Class<? extends Class> aClass1 = Card.class.getClass(); //case2.
        try {
            Class<?> aClass2 = Class.forName("basic.java.clasic.utils.Card"); //case3.
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
///////////////////////////////////////////////////////////////////////////////////////
        System.out.println("////////////////////////////////////////////////////////////");
        // 예시
        Card c1 = new Card("HEAT", 3); //new 연산자로 객체 생성
        Card c2 = Card.class.newInstance(); // Class 객체를 통해서 객체 생성

        Class<? extends Card> cObj = c1.getClass();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toString());
        System.out.println(cObj.toGenericString());
    }
}

final class Card {
    String kind;
    int num;

    public Card() {
        this("SPADE", 1);
    }

    public Card(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    @Override
    public String toString() {
        return kind + ":" + num;
    }
}








