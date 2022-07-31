package basic.java.clasic.collection;

import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        properties.list(System.out);
    }
}
