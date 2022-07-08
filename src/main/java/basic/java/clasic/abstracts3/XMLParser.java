package basic.java.clasic.abstracts3;

public class XMLParser implements Parseable {
    @Override
    public void parse(String fileName) {
        System.out.println(fileName + "XMLParser");
    }
}
