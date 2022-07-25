package basic.java.clasic.utils;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;

public class CharAndStringTest {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String a = "가";

        byte[] b1 = a.getBytes(StandardCharsets.UTF_8);
        byte[] b2 = a.getBytes("CP949");

        System.out.println(b1);
        System.out.println(b2);

        joinByteArr(b1);
        joinByteArr(b2);

        String s1 = new String(b1, StandardCharsets.UTF_8);
        String s2 = new String(b2, "CP949");

        System.out.println(s1);
        System.out.println(s2);




    }

    static String joinByteArr(byte[] arr) {
        StringJoiner stringJoiner = new StringJoiner(":", "[", "]");
        for (byte b : arr) {
            System.out.println(b);
            String format = String.format("%02x", b);
            System.out.println(format);
            stringJoiner.add(format);
        }
        return stringJoiner.toString();
    }

}
