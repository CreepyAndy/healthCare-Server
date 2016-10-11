package com.xia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="t_estimateStatus")
public class EstimateStatus {
	private int id;
	private String healthStatus;
	private String ScaleOfDangerness;
	private String Cause;
	private Employee employee;
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHealthStatus() {
		return healthStatus;
	}
	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}
	public String getScaleOfDangerness() {
		return ScaleOfDangerness;
	}
	public void setScaleOfDangerness(String scaleOfDangerness) {
		ScaleOfDangerness = scaleOfDangerness;
	}
	public String getCause() {
		return Cause;
	}
	public void setCause(String cause) {
		Cause = cause;
	}
	@ManyToOne
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
