package basic.java.clasic.exception;

public class ExceptionTest6_2 {
    public static void main(String[] args) {
        System.out.println(sample());
    }

    private static String sample() {
        String val = "";
        try {
            val = "1";
            throw new RuntimeException();
        } catch (RuntimeException e) {
            val = "10";
            return val;
        } finally {
            val = "40";
//            return val;
        }
    }
}
