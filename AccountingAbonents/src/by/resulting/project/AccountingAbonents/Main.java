package by.resulting.project.AccountingAbonents;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

//import by.resulting.project.AccountingAbonents.dao.AbonentDao;
//import by.resulting.project.AccountingAbonents.dao.daoImpl.AbonentDaoImpl;
import by.resulting.project.AccountingAbonents.entity.Abonent;
import by.resulting.project.AccountingAbonents.service.AbonentService;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, NamingException {
//--------------------------------Проверка Abonent DAO
//        PersonService personService = new PersonService();
//        personService.addPerson("Test", "Test", "pass", "login" );
//        personService.editPerson(11, "Test2", "Test2", "proverka", "login2");
    	
    	
    	AbonentService abonentService = new AbonentService();
    	Abonent test =  abonentService.getAbonentById(1);
    	System.out.println(test.getFirstName() + " " + test.getSecondName() + " " + test.getLogin() + " " + test.getPassword() + " " + test.getEmail() + " " + test.getIsActive());
    	List<Abonent> abonentList = abonentService.getAllAbonents();
    		for (Abonent element:abonentList){
    			System.out.println(element.getId() + " " + element.getFirstName() + " " + element.getSecondName());
    		}
  	
    	
        /*AbonentDaoImpl abonentDaoImpl = new AbonentDaoImpl();
        try {
			Abonent test = abonentDaoImpl.getAbonentById(3);
        	System.out.println(test.getFirstName() + " " + test.getSecondName());
		} catch (NamingException e) {
			e.printStackTrace();
		}*/
    	
//    	System.out.println("personService.getPerson(3); = " + personService.getPerson(3).getFirstName() + " " + personService.getPerson(3).getSecondName());
//List<Person> personlist = personService.getPersons();
//        for (Person p:personlist){
//            System.out.println("FirstName: " + p.getFirstName() + " SecondName: " + p.getEmail());
//        }

//personService.deletePerson(12);

//----------------------------Проверяем Courses DAO

//        CoursesService coursesService = new CoursesService();
//        coursesService.addCourses("Проверка добавления новых куров");
//        coursesService.deleteCourses(5);
//        coursesService.editCourses(7, "Проверка проверки редактирования записи");


/*        List<Courses> coursesList = coursesService.getCourses();
        for (Courses c : coursesList){
            System.out.println("c.getCourceName() + \" \" + c.getId() = " + c.getCourceName() + " " + c.getId());
        }
*/


/*       Person person = personService.getPerson(2);
        List <Courses> coursesList = coursesService.getOnePersonCourses(person);
        for (Courses c :coursesList){
            System.out.println("c.getCourceName() + \" \" + c.getId() = " + c.getCourceName() + " " + c.getId());
        }
*/



    }
}
