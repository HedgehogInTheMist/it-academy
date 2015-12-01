package oop_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	private String logMessage;
	private File file = new File("./src/logs/log.txt");
	private PrintWriter printWriter;
	
	private Logger() {
		if (!file.exists()) {
			try {
				 file.createNewFile();
			} catch (IOException e) {
				System.out.println("Log file error");
			}
		}
	}
	
	private static class InstanceLoggerHolder {
		private static final Logger INSTANCE = new Logger();
	}
	
	public static Logger getInstance() {
		return InstanceLoggerHolder.INSTANCE;
	}
	
	public void logging(String logMessage) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		try {
			 printWriter = new PrintWriter(new FileWriter(file, true));
			 printWriter.println(dateFormat.format(date) + " - " + logMessage);
		} catch (IOException e) {
			System.out.println("Can't write in logFile");
		} finally {
			printWriter.close();
		}
	}
}
