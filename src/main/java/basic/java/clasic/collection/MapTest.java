package basic.java.clasic.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

    static HashMap phoneBook = new HashMap();
//    static HashMap<String, HashMap<String, Object>> phoneBookType = new HashMap();

    // HashMap
    public static void main(String[] args) {

        addPhoneNo("친구", "손흥민", "080-21231-1231");
        addPhoneNo("친구", "케인", "080-21231-1232");
        addPhoneNo("친구", "클루셉스키", "080-21231-1233");
        addPhoneNo("회장", "레니", "080-21231-1234");
        addPhoneNo("감독", "콘테", "080-21231-1235");
        addPhoneNo("에르메송", "000-000-0000");

        printList();
    }


    private static void addPhoneNo(String groupName, String name, String tel) {
        addGroup(groupName);
        HashMap group = (HashMap) phoneBook.get(groupName);
        group.put(tel, name); // 이름은 중복이 되지만 전화번호는 중복이 안되서 키로 사용
    }

    private static void addGroup(String groupName) {
        if (!phoneBook.containsKey(groupName)) phoneBook.put(groupName, new HashMap<>());
    }

    private static void addPhoneNo(String name, String tell) {
        addPhoneNo("기타", name, tell);
    }

    private static void printList() {
        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            Set subSet = ((HashMap) e.getValue()).entrySet();
            Iterator subIt = subSet.iterator();
            System.out.println("*" + e.getKey() + " :: " + subSet.size());

            while (subIt.hasNext()) {
                Map.Entry subE = (Map.Entry) subIt.next();
                String telNo = (String) subE.getKey();
                String name = (String) subE.getValue();
                System.out.println(name + " :: " + telNo);
            }
            System.out.println();
        }

    }


}
