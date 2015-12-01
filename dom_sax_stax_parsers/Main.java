package dom_sax_stax_parsers;

import java.io.File;

import dom_sax_stax_parsers.parsers.AbstractParser;
import dom_sax_stax_parsers.singleFactory.SingletonFactory;

public class Main {

	public static void main(String[] args) {

		File file = new File("src/resources/Planes.xml");
		SingletonFactory factory = SingletonFactory.getInstance();

		AbstractParser parser = factory.getParser("StAX");
		parser.anyParse(file);
		parser = factory.getParser("SAX");
		parser.anyParse(file);
		parser = factory.getParser("DOM");
		parser.anyParse(file);
	}
}
