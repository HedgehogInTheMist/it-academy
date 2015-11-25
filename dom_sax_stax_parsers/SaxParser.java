package dom_sax_stax_parsers;

import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import org.xml.sax.SAXException;
import java.io.IOException;

public class SaxParser {
	public static void main(String[] args) {
		try {
				XMLReader reader = XMLReaderFactory.createXMLReader();
				PlaneHandler handler = new PlaneHandler();
				reader.setContentHandler(handler);
				reader.parse("e:/Lessons/it-academy/src/dom_sax_stax_parsers/resources/Planes.xml");
		} catch(SAXException e) {
			System.err.print("SAX parser error" + e);
		} catch(IOException e) {
			System.err.print("I/O stream error" + e);
		}
	}
}
