package xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

/**
 * Created by dyr on 2016/7/25.
 */
public class XmlSAX {
    public static void main(String[] args) {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            saxParser.parse("./src/xml/book.xml", new DefaultHandler() {
                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    super.startElement(uri, localName, qName, attributes);
//                    if(qName.equals("book")){
//                        System.out.println(attributes.getValue("id"));//3
//
//                    }
                    System.out.print(qName + " ");
                    for (int i = 0; i < attributes.getLength(); i++) {
                        System.out.print(attributes.getQName(i) + ":");
                        System.out.println(attributes.getValue(i));
                    }


                }

                @Override
                public void endElement(String uri, String localName, String qName) throws SAXException {
                    super.endElement(uri, localName, qName);
                }

                @Override
                public void startDocument() throws SAXException {
                    super.startDocument();
                    System.out.println("sax start");
                }

                @Override
                public void endDocument() throws SAXException {
                    super.endDocument();
                    System.out.println("sax end!");
                }

                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    super.characters(ch, start, length);
                    String str = new String(ch, start, length);
                    if (str.trim().length() != 0) {

                        System.out.println(str);
                    }
                }
            });
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
