package basic.java.clasic.comparable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Sample> list = new ArrayList<>();
        list.sort(new SampleComparator());
    }
}

class Sample {
    private int id;
    private String name;

    public Sample() {
    }

    public Sample(int id, String name) {
        super();
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

class SampleComparator implements Comparator<Sample> {
    @Override
    public int compare(Sample s1, Sample s2) {

        if (s1.getId() > s2.getId()) {
            return 1;
        } else if (s1.getId() < s2.getId()) {
            return -1;
        } else {
            return 0;
        }

    }
}