package dom_sax_stax_parsers.singleFactory;

import dom_sax_stax_parsers.parsers.AbstractParser;
import dom_sax_stax_parsers.parsers.DOMParser;
import dom_sax_stax_parsers.parsers.SAXParser;
import dom_sax_stax_parsers.parsers.StAXParser;

/**
 * Singleton Factory produces parsers
 * */
public class SingletonFactory {

	
	private SingletonFactory() {
	}

	private static class SingletonFactoryHolder {
		private static final SingletonFactory INSTANCE = new SingletonFactory();
	}

	public static SingletonFactory getInstance() {
		return SingletonFactoryHolder.INSTANCE;
	}

	public AbstractParser getParser(String parserType) {
		switch (parserType) {
		case "DOM":
			return new DOMParser();
		case "SAX":
			return new SAXParser();
		case "StAX":
			return new StAXParser();
		}
		return null;
	}
}