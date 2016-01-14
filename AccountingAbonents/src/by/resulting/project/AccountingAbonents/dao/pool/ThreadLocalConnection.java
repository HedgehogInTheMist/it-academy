package by.resulting.project.AccountingAbonents.dao.pool;

import java.sql.Connection;

public class ThreadLocalConnection {
	private static ThreadLocal<Connection> connectionHolder = new ThreadLocal<Connection>() {
		protected Connection initialValue() {
			return (Connection) new SimpleBasicDataSource().getConnection();
		}
	};
	
	public static Connection getConnection() {
		return connectionHolder.get();
	}
	
	public static void removeConnection() {
		connectionHolder.remove();
	}
}
