package basic.java.clasic.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //List 에서 요소를 삭제하는 올바른 방법은?
        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();

        for (int i = a.size() - 1; i >= 0; i--) {
            if (a.contains(b.get(i))) {
                b.remove(i);
            }
        }



    }
}