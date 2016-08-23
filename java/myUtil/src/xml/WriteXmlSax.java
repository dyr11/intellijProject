package xml;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by dyr on 2016/7/26.
 */
public class WriteXmlSax {
    public static void main(String[] args){
        SAXTransformerFactory saxTransformerFactory= (SAXTransformerFactory) SAXTransformerFactory.newInstance();
        try {
            TransformerHandler transformerHandler=saxTransformerFactory.newTransformerHandler();
            Transformer transformer=transformerHandler.getTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");
            transformer.setOutputProperty(OutputKeys.ENCODING,"UTF-8");
            Result result=new StreamResult(new FileOutputStream(new File("./src/xml/sax.xml")));
            transformerHandler.setResult(result);
            transformerHandler.startDocument();
            AttributesImpl attribute=new AttributesImpl();
            transformerHandler.startElement(null,null,"booklist",attribute);
            attribute.clear();
            attribute.addAttribute(null,null,"id",null,"3");
            transformerHandler.startElement(null,null,"book",attribute);
            transformerHandler.characters("hello world".toCharArray(),0,"hello world".length());
            transformerHandler.endElement(null,null,"book");
            transformerHandler.endElement(null,null,"booklist");
            transformerHandler.endDocument();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
