package basic.java.clasic.exception;

public class ExceptionTest6 {
    public static void main(String[] args) {
        int result = sample();
        System.out.println(result);
    }

    private static int sample() {
        int val = 0;
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            val = 10;
            return val;
        } finally {
            val += 40;
        }
    }
}
