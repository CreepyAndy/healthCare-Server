package com.xia.services;

import java.sql.Date;
import java.util.Calendar;

import javax.jws.WebService;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.xia.model.Employee;

@WebService(endpointInterface = "com.xia.services.VerifyInterface" ) 
public class VerifyInterfaceImpl implements VerifyInterface{

	@Override
	public boolean verifyUser(String id, String password) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		 session.beginTransaction();
		 Employee e=(Employee)session.get(Employee.class,Integer.parseInt(id));		
		 if(e==null)
			 return false;
		 if(password.equals(e.getPassword()))
			 return true;
		return false;
	}

	@Override
	public void createUser(String id, String name, String psw,String year,String month,String day) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Employee e = new Employee();
		e.setId(Integer.parseInt(id));
		e.setName(name);
		e.setPassword(psw);
		Date d = new Date(Integer.parseInt(year)-1900,Integer.parseInt(month)-1,Integer.parseInt(day));
		e.setBirthday(d);
		
		session.save(e);
		session.getTransaction().commit();
	}

}
