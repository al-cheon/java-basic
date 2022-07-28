package basic.java.clasic.collections;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionTest1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");   //todo) size 가 고정된다
        //        baseList.add("D"); //todo) UnsupportedOperationException 예외발생

        List<String> basedList = new ArrayList<>(list);
        List<String> copyList = Collections.unmodifiableList(basedList); //todo) immutable list가 반환되는 게 아님
        System.out.println("basedList :: " + basedList);
        System.out.println("copyList :: " + copyList);

        basedList.set(0, "Z");
        System.out.println("basedList :: " + basedList);
        System.out.println("copyList :: " + copyList);
        // 바꾼건 basedList인데 copyList도 바뀜 참조하고 있기 때문에
        // 정말 immutable list를 만들고 싶은 경우는 2가지 방법이 있다 (java 10 이후)
//        List<String> copyList2 = List.copyOf(basedList);
//        System.out.println("copyList2 :: " + copyList2);

//        List<String> copyList3 = basedList.stream().collect(Collectors.toUnmodifiableList());
//        System.out.println("copyList3 :: " + copyList3);

    }
}
