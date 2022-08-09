package basic.java.clasic.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Aaaaaa {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("eee");
        strings.add("aaa");
        String s = strings.toString();
        System.out.println(s);
    }
}

interface Ex {
    static <T> Predicate<T> isEqual(Object targetRef) {
        return (null == targetRef)
                ? Objects::isNull
                : object -> targetRef.equals(object);
    }
}
