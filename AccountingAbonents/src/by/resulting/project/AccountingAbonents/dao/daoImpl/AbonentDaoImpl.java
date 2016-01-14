package by.resulting.project.AccountingAbonents.dao.daoImpl;

import static by.resulting.project.AccountingAbonents.Utils.Constants.GET_PERSONS;
import static by.resulting.project.AccountingAbonents.Utils.Constants.GET_ONE_PERSON;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.resulting.project.AccountingAbonents.Utils.DBUtils;
import by.resulting.project.AccountingAbonents.dao.AbonentDao;
import by.resulting.project.AccountingAbonents.dao.pool.SimpleBasicDataSource;
import by.resulting.project.AccountingAbonents.entity.Abonent;

//public class AbonentDaoImpl extends AbstractDao<Integer, Abonent> implements AbonentDao {
public class AbonentDaoImpl implements AbonentDao {
	private SimpleBasicDataSource dataSource = null;
	
	public AbonentDaoImpl() {
        dataSource = SimpleBasicDataSource.getInstance();
    }
	
	@Override
    public Abonent getAbonentById(long n) throws ClassNotFoundException {
        Connection connection = null;
        Abonent abonent = new Abonent();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(GET_ONE_PERSON);
            preparedStatement.setLong(1, n);
            resultSet = preparedStatement.executeQuery();
            abonent = initAbonent(resultSet);
            DBUtils.close(preparedStatement, resultSet, connection);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(preparedStatement, resultSet, connection);
        }
        return abonent;
    }
	
    private Abonent initAbonent(ResultSet resultSet) throws ClassNotFoundException {
        Abonent abonent = new Abonent();
        try {
            while (resultSet.next()) {
                abonent.setId(resultSet.getInt(1));
                abonent.setFirstName(resultSet.getString(2));
                abonent.setSecondName(resultSet.getString(3));
                abonent.setLogin(resultSet.getString(4));
                abonent.setPassword(resultSet.getString(5));
                abonent.setEmail(resultSet.getString(7));
//                person.setRole(resultSet.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return abonent;
    }

    @Override
    public List<Abonent> getAllAbonents() {
        Connection connection = null;
        List<Abonent> abonents = null;
        ResultSet resultSet = null;
        Statement statement = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(GET_PERSONS);
            abonents = initAbonents(resultSet);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(statement, resultSet, connection);
        }

        return abonents;
    }

    private List<Abonent> initAbonents(ResultSet resultSet) {
        List<Abonent> abonents = new ArrayList<Abonent>();
        try {
            while (resultSet.next()) {
                Abonent abonent = new Abonent();
                abonent.setId(resultSet.getInt(1));
                abonent.setFirstName(resultSet.getString(2));
                abonent.setSecondName(resultSet.getString(3));
                abonent.setLogin(resultSet.getString(4));
                abonent.setPassword(resultSet.getString(5));
                
//              abonent.setRole(resultSet.getString(4));
                abonents.add(abonent);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return abonents;
    }


	@Override
	public void editAbonent(Abonent abonent) throws ClassNotFoundException, SQLException {
		
	}

	@Override
	public void blockAbonent(long userId) throws SQLException {
		
	}

	@Override
	public void deleteAbonent(long userId) throws SQLException {
		
	}
	
	@Override
	public void addAbonent(Abonent abonent) throws ClassNotFoundException, SQLException {
		
	}

}
