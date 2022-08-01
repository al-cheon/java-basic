package basic.java.clasic.collection;

import java.util.ArrayList;

public class ListTest2 {
    public static void main(String[] args) {
        //remove 는 대상이 여러개 있어서 맨처음 일치하나 하나만 삭제한다
        // TODO 주의!!
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");  //TODO) ConcurrentModificationException 발생지점
        for (String s : list) {
            if (s.equals("B")) {
                list.remove(s);
            } else {
                System.out.println(s);
            }
        }
//        extracted_2(list);
//        extracted_1(list);

    }

    private static void extracted_2(ArrayList<String> list) {
        list.removeIf(f -> {
            return f.equals("B");
        });
    }

    private static void extracted_1(ArrayList<String> list) {
        for (String s : list) {
            if (s.equals("B")) {
                list.remove(s);
            } else {
                System.out.println(s);
            }
        }
    }
}
