package dom_sax_stax_parsers;

import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public class PlaneHandler extends DefaultHandler {

	@Override
	public void startDocument() throws SAXException {
		System.out.println("\t\tParsing started\n");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("\n\n\t\tParsing ended");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		String s = localName;
		for(int i = 0; i < attributes.getLength(); i++) {
			s += " " + attributes.getLocalName(i) + "=" + attributes.getValue(i);
		}
		System.out.print(s.trim());
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.print(localName);
		if(localName.equals("СУ-24")) {
			System.out.println();
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		System.out.print(new String(ch, start, length));
	}
	
}
