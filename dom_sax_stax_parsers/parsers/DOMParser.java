package parsers;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * This is DOMParser implementation
 * 
 * */
public class DOMParser extends AbstractParser {

	@Override
	public void anyParse(File fileName) {

		System.out.println("====================================================");
		System.out.println("\t\tDOMParser started");
		System.out.println("----------------------------------------------------");

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		Document doc = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		try {
			doc = builder.parse(fileName);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Element root = doc.getDocumentElement();
		System.out.print(root.getTagName());

		NamedNodeMap attributes = root.getAttributes();
		for (int i = 0; i < attributes.getLength(); i++) {
			System.out.print(attributes.item(i).getNodeName() + ":" + attributes.item(i).getNodeValue() + " ");
		}

		NodeList nList = root.getChildNodes();
		for (int i = 0; i < nList.getLength(); i++) {
			if (nList.item(i) instanceof Element) {
				System.out.println(nList.item(i).getNodeName());

				NodeList nList2 = nList.item(i).getChildNodes();
				for (int j = 0; j < nList2.getLength(); j++) {
					if (nList2.item(j) instanceof Element) {
						System.out.println(
								"    " + nList2.item(j).getNodeName() + nList2.item(j).getTextContent());
					}
				}

			}
		}
		System.out.println("----------------------------------------------------");
		System.out.println("\t\tDOMParser ended");
		System.out.println("====================================================");
	}

}