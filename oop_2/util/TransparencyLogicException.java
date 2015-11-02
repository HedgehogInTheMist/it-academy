package oop_2.util;

import java.io.Serializable;

public class TransparencyLogicException extends Exception implements Serializable {
	
	private static final long serialVersionUID = 7L;
	
	public TransparencyLogicException () {
	}
	
	public TransparencyLogicException(String message) {
		super(message);
	}
	
	public TransparencyLogicException(Throwable exception) {
		super(exception);
	}
	
	public TransparencyLogicException(String message, Throwable exception) {
		super(message, exception);
	}
}
