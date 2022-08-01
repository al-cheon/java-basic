package basic.java.clasic.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapTest2 {
    public static void main(String[] args) {
        Map<Integer, Item> map = new HashMap();
        map.put(1, new Item(1, "A"));
        map.put(2, new Item(2, "B"));
        map.put(3, new Item(3, "C"));
        map.put(1, new Item(1, "A"));
        map.put(null, new Item(0, "default"));
        System.out.println(map.size());

        Consumer consumer = (m) -> {
            if (m instanceof Map) {
                Set<Map.Entry<Integer, Item>> entries = map.entrySet();
                for (Map.Entry<Integer, Item> entry : entries) {
                    Item value = entry.getValue();
                    System.out.println(value.id + "::" + value.getName());
                }

            }
        };
        consumer.accept((Map<Integer, Item>) map);

    }

    private static class Item {
        private int id;
        private String name;

        public Item(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

}
