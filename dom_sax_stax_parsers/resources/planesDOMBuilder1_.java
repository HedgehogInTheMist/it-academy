package dom_sax_stax_parsers.resources;

import java.util.HashSet;
import java.util.Set;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class PlanesDOMBuilder {
	
	private Set<Plane> planes;
	public PlanesDOMBuilder() {
		this.planes = new HashSet<Plane>();
		//Creating DOM-analyzer
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
				docBuilder = factory.newDocumentBuilder(); 
		} catch(ParserConfigurationException e) {
			System.err.println("Error parser configuring: " + e);
		}
	}
	public Set<Plane> getPlanes() {
		return planes;
	}
	
	public void buildSetPlanes(String fileName) {
		Document doc = null;
		try {
				doc = docBuilder.parse(fileName);
				Element root = doc.getDocumentElement();
				
				NodeList planesList = root.getElementsByTagName("Model");
				for(int i = 0; i < planesList.getLength(); i++) {
					Element planeElement = (Element) planesList.item(i);
					Plane plane = buildPlane(planeElement);
				}
		}
	}
}

















