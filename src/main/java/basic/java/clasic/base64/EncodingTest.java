package basic.java.clasic.base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncodingTest {
    public static void main(String[] args) {
        String target = "apple";
        byte[] encode1 = Base64.getEncoder().encode(target.getBytes(StandardCharsets.UTF_8));
        byte[] encode2 = Base64.getEncoder().encode(target.getBytes());
        System.out.println(encode1);
        System.out.println(encode2);
        String s = Base64.getEncoder().encodeToString(target.getBytes(StandardCharsets.UTF_8));
        System.out.println(s);
    }
}
