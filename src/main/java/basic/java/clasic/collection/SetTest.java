package basic.java.clasic.collection;

import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        // TreeSet Lotto
        Set set = new TreeSet<>();
        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);
        }
        System.out.println(set);
        System.out.println("===========================");

        // Ascii Print
        char ch = ' ';
        for (int i = 0; i < 95; i++) { // 공백(' ') 이후의 문자 출력
            System.out.print(ch++);
        }

    }
}
