package xml;


import org.testng.annotations.Test;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by dyr on 2016/7/25.
 */


public class XmlDom {
    @Test
    public static void main(String[] args) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse("./src/xml/book.xml");
            NodeList nodeList = document.getElementsByTagName("book");
            int length = nodeList.getLength();
            for (int i = 0; i < length; i++) {
                Node node = nodeList.item(i);
                NamedNodeMap namedNodeMap = node.getAttributes();
                for (int j = 0; j < namedNodeMap.getLength(); j++) {
                    Node node1 = namedNodeMap.item(j);
                    String nodeName = node.getNodeName();//id
                    String nodeValue = node.getNodeValue();//3
                }
                NodeList bookInfo=node.getChildNodes();
                for(int j=0;j<bookInfo.getLength();j++){
                    Node node2=bookInfo.item(j);
                    if(node2.getNodeType()==Node.TEXT_NODE){
                        //blank node
                    }else if(node2.getNodeType()==Node.ELEMENT_NODE){
                        System.out.print(node2.getNodeName()+":");//name
                        System.out.println(node2.getFirstChild().getNodeValue());//bookname1
                       // System.out.println(node2.getTextContent());
                    }
                }
            }
            Element element = (Element) nodeList.item(0);
            String nodeValue = element.getAttribute("id");//3;
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
