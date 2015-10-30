package oop_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializator {
	/**
	 * 
	 * @param Object
	 * @param fileName
	 * @return
	 */
	public boolean serialization(Object obj, String fileName) {
		boolean flag = false;
		File file = new File(fileName);
		ObjectOutputStream objectOutputStream = null;
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			if(fileOutputStream != null) {
				objectOutputStream = new ObjectOutputStream(fileOutputStream);
				objectOutputStream.writeObject(obj); //Here it is! Serialization! Hurray!!!
				flag = true;
			}
		} catch (FileNotFoundException e) {
			System.err.println("Ups...probably can't be created" + e);
		} catch (IOException e) {
			System.out.println("Some sort of IOException" + e);
		} finally {
				try {
						if(objectOutputStream != null) {
							objectOutputStream.close();
						}
					} catch(IOException ioe) {
						System.err.println("General IOExcepton " + ioe);
					}
				}
		return flag;
		}
	
	public Object deserialization(String fileName) throws InvalidObjectException {
		File file = new File(fileName);
		ObjectInputStream objectInputStream = null;
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream); //And here it is back, again. Deserialization! Large as life and twice as ugly!
			Object Object = (Object) objectInputStream.readObject();
			//Object Object = (Object) objectInputStream.readObject();
			return Object;
		} catch (ClassNotFoundException cnfe) {
			System.err.println("Class doesn't exist: " + cnfe);
		} catch (FileNotFoundException fnfe) {
			System.err.println("I suppose, file doesn't exist: " + fnfe);
		} catch (InvalidClassException ice) {
			System.err.println("Class doesn't exist: " + ice);
		} catch (IOException ioe) {
			System.err.println("Some sort of general IOException " + ioe);
		} finally {
					try {
						 if(objectInputStream != null) {
							 objectInputStream.close();
						 }
					} catch(IOException ioe) {
						System.err.println("Error during closing stream");
					}
		}
		throw new InvalidObjectException("Object not recieved");
	}
}
