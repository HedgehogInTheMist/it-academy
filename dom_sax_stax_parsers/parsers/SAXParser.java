package dom_sax_stax_parsers.parsers;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * This is SAXParser implementation
 * 
 * */
public class SAXParser extends AbstractParser {

	@Override
	public void anyParse(File fileName) {

		try {

			SAXParserFactory factory = SAXParserFactory.newInstance();
			javax.xml.parsers.SAXParser saxParser = factory.newSAXParser();
			DefaultHandler handler = new DefaultHandler() {

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
				

				@Override
				public void startDocument() {
					System.out.println("====================================================");
					System.out.println("\t\tSAXParser started");
					System.out.println("----------------------------------------------------");
				}
				
				@Override
				public void startElement(String uri, String localName, String qName, Attributes attributes) {
					if(qName.equalsIgnoreCase("Plane")) {
						isPlane=true;
					}
					String s = localName;
					for (int i = 0; i < attributes.getLength(); i++) {
						s += " " + attributes.getLocalName(i) + "=" + attributes.getValue(i);
					}
					System.out.print(s.trim());
				}
				
				@Override
				public void characters(char[] ch, int start, int length) {
					if(isPlane)
					System.out.print(" " + new String(ch, start, length) + " ");
				}

				@Override
				public void endElement(String uri, String localName, String qName) {
					System.out.print(localName);
				}

				@Override
				public void endDocument() {
					System.out.println("----------------------------------------------------");
					System.out.println("\t\tSAXParser ended");
					System.out.println("====================================================");
				}
			};
			saxParser.parse(new FileInputStream(fileName), handler);
		} catch (Exception e) {
			System.err.println(e);;
		}
	}
}