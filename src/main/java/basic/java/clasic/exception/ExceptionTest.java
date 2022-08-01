package basic.java.clasic.exception;

public class ExceptionTest {
    public static void main(String[] args) {

        System.out.println(test(null));
        System.out.println("::::::::::::::::::::");

        System.out.println(test2());

    }

    private static String test(Object o) {
        try {
            System.out.println(o.toString());
        } catch (NullPointerException e) {
            System.out.println("AA");
            return "A";
        } finally {
            System.out.println("B");
        }
        return "C";
    }

    private static String test2() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("CC");
            return "C";
        } finally {
            System.out.println("FF");
            return "F";
        }
    }


}

