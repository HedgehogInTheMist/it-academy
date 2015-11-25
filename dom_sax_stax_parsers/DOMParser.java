package dom_sax_stax_parsers;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMParser {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = factory.newDocumentBuilder();
		Document doc = documentBuilder.parse(new File("src/resources/planes.xml"));
		
		String titleE1 = doc.getDocumentElement().getNodeName();
		System.out.println("TitleE1 = " + titleE1);
		
		NodeList nodeList = doc.getElementsByTagName("Plane");
		String title = "";
		int price = 0, amount = 0;
		
		for(int i = 0; i < nodeList.getLength(); i++) {
			Element element = (Element)nodeList.item(i);
			title = element.getElementsByTagName("Model").item(0).getChildNodes().item(0).getChildNodes().item(0).getNodeValue();
			System.out.println(title);
		}
	}
		
}
