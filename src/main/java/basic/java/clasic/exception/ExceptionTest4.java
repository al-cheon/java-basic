package basic.java.clasic.exception;

public class ExceptionTest4 {
    public static void main(String[] args) {

        int val = 0;
        try {
            throw new SampleException1();
        } catch (SampleException2 e) {  //순서주의

        } catch (SampleException1 e2) {
            val = 10;
            System.out.println(val);
            return;
        } finally {
            val += 10;
            System.out.println(val);
        }


    }


    static class SampleException1 extends Exception { }
    static class SampleException2 extends SampleException1 { }
}

