package basic.java.clasic.collection;

import java.util.ArrayList;
import java.util.Arrays;
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

        List<String> objects = Arrays.asList(new String[]{"A", "B", "C"});
        objects.forEach(System.out::print);

        //////////////////////////
        System.out.println();
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        List<String> list2 = new ArrayList<>();
        list2.add("a");

        list1.retainAll(list2);
        System.out.println(list1);
        list1.clear();
        System.out.println(list1);

    }
}
