package basic.java.clasic.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest3 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "c", "d", "e");

        //build_01 :: 익명클래스
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });


        //build_02 :: 익명클래스 + 익명메서드
        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));



    }
}
