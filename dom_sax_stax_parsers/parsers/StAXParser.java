package dom_sax_stax_parsers.parsers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 * This is SAXParser implementation
 * 
 * */
public class StAXParser extends AbstractParser {

	@Override
	public void anyParse(File fileName) {

		System.out.println("====================================================");
		System.out.println("\t\tStAXParser started");
		System.out.println("----------------------------------------------------");
		
		boolean isPlane = false;
		boolean isOrigin = false;
		boolean isChars = false;
		boolean isParameters = false;
		boolean isPrice = false;
		boolean isPlanesList = false;
		
		boolean isType = false;
		boolean isCrew = false;
		boolean isPassangers = false;
		boolean isRadar = false;
		boolean isSpeed = false;
		
		boolean isLength = false;
		boolean isWidth = false;
		boolean isHeight = false;
		
		XMLInputFactory factory = XMLInputFactory.newFactory();
		try {
			XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream(fileName));
			while (reader.hasNext()) {
				int res = reader.next();
				if (res == XMLStreamConstants.START_ELEMENT) {
					if (reader.getLocalName().equals("Plane")) {
						isPlanesList = true;
						System.out.print(reader.getLocalName() + ": ");
						for (int i=0; i<reader.getAttributeCount(); i++) {
							System.out.print(reader.getAttributeLocalName(i) + "=" + reader.getAttributeValue(i));
						}
						System.out.println();
					} else if (reader.getLocalName().equals("Model")) {
						isPlane = true;
						System.out.print(reader.getLocalName() + ": ");
						for (int i=0; i<reader.getAttributeCount(); i++) {
							System.out.print(reader.getAttributeLocalName(i) + "=" + reader.getAttributeValue(i));
						}
					} else if(reader.getLocalName().equals("Origin")) {
						isOrigin = true;
					} else if(reader.getLocalName().equals("Chars")) {
						isChars = true;
					} else if(reader.getLocalName().equals("Type")) {   ///added
						isType = true;
					} else if(reader.getLocalName().equals("Crew")) {
						isCrew = true;
					} else if(reader.getLocalName().equals("Passangers")) {
						isPassangers = true;
					} else if(reader.getLocalName().equals("Radar")) {
						isRadar = true;
					} else if(reader.getLocalName().equals("Speed")) {
						isSpeed = true;
					} else if(reader.getLocalName().equals("Parameters")) {
						isParameters = true;
					} else if(reader.getLocalName().equals("Length")) {
						isLength = true;
					} else if(reader.getLocalName().equals("Width")) {
						isWidth = true;
					} else if(reader.getLocalName().equals("Height")) {
						isHeight = true;
					} else if (reader.getLocalName().equals("Price")) {
						isPrice = true;
					}
				} else if (res == reader.CHARACTERS) {
					if (isOrigin) {
						System.out.println();
						System.out.println("    " + "Origin: " + reader.getText());
						isOrigin = false;
					} else if (isChars) {
						System.out.println("    " + "Chars: " + reader.getText());
						isChars = false;
					} else if (isSpeed) {
						System.out.println("        " + "Speed: " + reader.getText());
						isSpeed = false;
					} else if (isRadar) {
						System.out.println("        " + "Radar: " + reader.getText());
						isRadar = false;
					} else if (isPassangers) {
						System.out.println("        " + "Passangers : " + reader.getText());
						isPassangers = false;
					} else if (isCrew) {
						System.out.println("        " + "Crew: " + reader.getText());
						isCrew = false;
					} else if (isType) {
						System.out.println("        " + "Type: " + reader.getText());
						isType = false;
					} else if (isParameters) {
						System.out.println("    " + "Parameters:" + reader.getText());
						isParameters = false;
					} else if (isHeight) {
						System.out.println("        " + "Height: " + reader.getText());
						isHeight = false;
					} else if (isWidth) {
						System.out.println("        " + "Width: " + reader.getText());
						isWidth = false;
					} else if (isLength) {
						System.out.println("        " + "Length: " + reader.getText());
						isLength = false;
					} else if (isPrice) {
						System.out.println("    " + "Price: " + reader.getText());
						isPrice = false;
					}
				} 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println("\t\tStAXParser ended");
		System.out.println("====================================================");
		
	}

}