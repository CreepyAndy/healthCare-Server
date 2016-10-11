package com.xia.services;

import java.sql.Date;
import java.util.Calendar;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface VerifyInterface {
	@WebMethod  
	public boolean verifyUser(String id,String password);
	@WebMethod
	public void createUser(String id,String name,String psw,String year,String month,String day);
}
