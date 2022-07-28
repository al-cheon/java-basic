package basic.java.clasic.object;

import java.util.Objects;

public class ObjectEquals {
    public static void main(String[] args) {

        //String 비교 **특별취급
        String stringA = "aaa";
        String stringB = "aaa";
        System.out.println(stringA.equals(stringB));
        System.out.println(stringA == stringB);
        System.out.println(Objects.equals(stringA, stringB)); //추천!!

        //Object 비교
        View v1 = new View(10);
        View v2 = new View(10);
        System.out.println(v1.equals(v2));
        System.out.println(v1 == v2);
        System.out.println(Objects.equals(v1, v2)); //추천!!

        /**
         * 1. Object 클래스에 정의된 hashCode()는 객체의 주소값을 이용해서 해쉬코드를 만들어 반환하기대문에 서로 다른 두 객체는 결코 같은 해시코드를 가질 수 없다
         * 2. String 클래스는 문자열의 내용이 갖으면, 동일한 해쉬코드를 반호나하도록 hashCode()가 오버라이딩되어 있기 대문에,
         *    문자열의 내용이 같은 서로다른 두 String 에 대해 hashCode()를 호출하면 항상 동일한 해시코드값을 얻는다
         */
        System.out.println(stringA.hashCode());
        System.out.println(stringB.hashCode());
        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());

        // todo) toString() 안을 보면 | getClass().getName() + "@" + Integer.toHexString(hashCode());
        // 오버라이딩해서 사용하도록 하자
        System.out.println(v1.toString());
        System.out.println(v2.toString());
    }
}


class View {
    int value;
    public View(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof View) {
            View view = (View) obj;
            return this.value == view.value;
        }
        return false;
    }

}