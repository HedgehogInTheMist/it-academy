package by.resulting.project.AccountingAbonents.dao;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import by.resulting.project.AccountingAbonents.entity.Abonent;

public interface AbonentDao {
	
	public void addAbonent(Abonent abonent) throws ClassNotFoundException, SQLException;
	
	public Abonent getAbonentById(long userId) throws SQLException, NamingException, ClassNotFoundException;
	
	public List<Abonent> getAllAbonents() throws SQLException, NamingException;
	
	public void editAbonent(Abonent abonent) throws ClassNotFoundException, SQLException;
	
	void blockAbonent(long userId) throws SQLException;
	
	void deleteAbonent(long userId) throws SQLException;
}
