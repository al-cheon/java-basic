package basic.java.clasic.generic;

import java.util.ArrayList;
import java.util.List;

public class Generic_2 {
    public static void main(String[] args) {



    }
enum Direction {EAST, SOUTH, WEST, NORTH}

//    public static void printAll(ArrayList<? extends Prod> list,
//                                ArrayList<? extends Prod> list2) {}

    public static <T extends Prod> void printAll(ArrayList<T> list,
                                ArrayList<T> list2) {}

//    public static <T extends Comparable<? super T>> void sort(List<T> list) {}
    public static <T extends Comparable<T>> void sort(List<T> list) {}

}


class Prod {

}