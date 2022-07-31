package basic.java.clasic.collection;

import org.springframework.util.ObjectUtils;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<String> linked = new LinkedList<>();
        Set<String> set = new HashSet<>();
        Set<Object> linkedSet = new LinkedHashSet<>();
        Map<String, Object> map = new HashMap<>();
        Set<Map.Entry<String, Object>> entrySet = map.entrySet();

    }
}
