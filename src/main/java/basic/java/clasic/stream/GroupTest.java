package basic.java.clasic.stream;

import java.util.ArrayList;
import java.util.List;

public class GroupTest {
    public static void main(String[] args) {
//        var sampleList = new ArrayList<>(List.of(
//                new Sample("A", "JP"),
//                new Sample("A", "FR"),
//                new Sample("A", "US"),
//                new Sample("A", "US"),
//                new Sample("A", "JP")));

        String a = null;
        a += "null";
        System.out.println(a);


    }
}

class Sample {
    String name;
    String country;

    public Sample(String name, String country) {
        this.name = name;
        this.country = country;
    }
}
