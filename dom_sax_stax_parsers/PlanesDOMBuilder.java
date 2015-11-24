package dom_sax_stax_parsers;

import org.xml.sax.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;

public class PlanesDOMBuilder {
	
	public static void main(String[] args) {
		Document xmlDoc = getDocument("src/resources/Planes.xml");
		System.out.println("Root: " + xmlDoc.getDocumentElement().getNodeName());
		NodeList listOfShows = xmlDoc.getElementsByTagName("Model");
		System.out.println("Number of show " + listOfShows.getLength());
		String elementName = "Airbus A320";
		String attrName = "speed";
		getElementAndAttrib(listOfShows, elementName, attrName);
	}

	private static void getElementAndAttrib(NodeList listOfShows, String elementName, String attrName) {
		try {
			for(int i = 0; i < listOfShows.getLength(); i++) {
				Node showNode = listOfShows.item(i);
				Element showElement = (Element)showNode;
				NodeList networkList = showElement.getElementsByTagName(elementName);
				Element networkElement = (Element)networkList.item(0);
				
				NodeList elementList = networkElement.getChildNodes();
				if(networkElement.hasAttribute(attrName)) {
					System.out.println(elementName + " : " + ((Node)elementList.item(0)).getNodeValue().trim() + " has attribute " + networkElement.getAttribute(attrName));
				} else {
					System.out.println(elementName + " : " + ((Node)elementList.item(0)).getNodeValue().trim());
				}
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	private static Document getDocument(String docString) {
		
		try {
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				
/*				factory.setIgnoringComments(true);
				factory.setIgnoringElementContentWhitespace(true);
				factory.setValidating(true);
*/				
				DocumentBuilder builder = factory.newDocumentBuilder();
				return builder.parse(new InputSource(docString));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
}
