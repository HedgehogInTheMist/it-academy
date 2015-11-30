package singleFactory;

import parsers.AbstractParser;
import parsers.DOMParser;
import parsers.SAXParser;
import parsers.StAXParser;

/**
 * Singleton Factory produces parsers
 * */
public class SingletonFactory {

	
	private SingletonFactory() {
	}

	public static class SingletonFactoryHolder {
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