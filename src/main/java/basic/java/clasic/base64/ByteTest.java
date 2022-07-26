package basic.java.clasic.base64;

import java.nio.charset.StandardCharsets;

public class ByteTest {
    public static void main(String[] args) {
        String target = "キーン・ジャパン合同会社";
        byte[] bytes1 = target.getBytes(StandardCharsets.UTF_8);
        byte[] bytes2 = target.getBytes();

        System.out.println(bytes1.length);
        System.out.println(bytes2.length);

    }
}
