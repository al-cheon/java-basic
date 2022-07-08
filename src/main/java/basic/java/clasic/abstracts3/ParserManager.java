package basic.java.clasic.abstracts3;

public class ParserManager {
    /**
     * todo 신기하게도 Parseable 를 임포트 하지 않고도 사용하고 있다
     * interface 는 모든 변수 메소드가 static 이므로 메모리에서 바로 꺼내 사용할 수 있다 (확신 x)
     * 근데 대부분 이런식으로 구현한다
     */
    public static Parseable getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        } else {
            return new HTMLParser();
        }
    }
}
