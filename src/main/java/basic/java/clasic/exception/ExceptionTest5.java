package basic.java.clasic.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest5 {
    public static void main(String[] args) {
        FileInputStream is = null;

        try {
            is = new FileInputStream("Sample.txt");
            throw new FileNotFoundException();
        } catch (Exception e) {
            System.out.println("A");
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    throw new RuntimeException();
                }
            }
            System.out.println("B");
        }
    }

    private static void test() {

    }
}
