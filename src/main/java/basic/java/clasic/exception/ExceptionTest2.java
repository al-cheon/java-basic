package basic.java.clasic.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.DayOfWeek;
import java.time.LocalTime;

public class ExceptionTest2 {
    public static void main(String[] args) throws TestException1 {

        if (args[0].length() == 0) {
            throw new TestException1();
        }

    }

    static class TestException1 extends Exception { }
    static class TestException2 extends RuntimeException { }
}
