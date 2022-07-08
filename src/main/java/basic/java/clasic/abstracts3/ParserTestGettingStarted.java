package basic.java.clasic.abstracts3;

import javax.swing.text.html.HTML;

public class ParserTestGettingStarted {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");

        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html");

    }
}
