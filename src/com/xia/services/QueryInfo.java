package com.xia.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.xia.model.*;
@WebService
public interface QueryInfo {
	@WebMethod  
	public List<Employee> queryPersonalInfoById();
	@WebMethod  
	public EstimateStatus queryEstimateStatusById(int id);
	@WebMethod  
	public void registerLivingConditions(LivingConditions livingConditions);
	@WebMethod  
	public BasicIndex queryBasicIndexById(String id);
	@WebMethod  
	public void updateBasicIndexById(String id,String heartRate,String height,String oxygen,String weight);
	
}
