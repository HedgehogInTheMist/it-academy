import java.io.File;
import parsers.AbstractParser;
import singleFactory.SingletonFactory;

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
