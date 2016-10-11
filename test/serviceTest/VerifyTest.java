package serviceTest;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.xia.model.Employee;
import com.xia.services.QueryInfoImpl;
import com.xia.services.VerifyInterfaceImpl;

public class VerifyTest {
	@Test
	public void employeeVerifyTest(){
		VerifyInterfaceImpl vs = new VerifyInterfaceImpl();
		System.out.println(vs.verifyUser("100","1234"));
	}
	@Test
	public void createUser(){
		VerifyInterfaceImpl vs = new VerifyInterfaceImpl();
		vs.createUser("3","afdsfafa","qqgdasgaaqq","1993","11","11");
	}
	
	
	
}
