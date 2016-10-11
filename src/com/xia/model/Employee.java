package com.xia.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javassist.bytecode.stackmap.Liveness;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="t_employee")
public class Employee {
	private int id;
	private String name;
	private String idCard;//身份证号
	private int gender;//性别，0代表女，1代表男
	private Date birthday;
	private String department;
	private String category;
	private String password;
	private Set<Cases> Cases = new HashSet<Cases>();
	private BasicIndex BasicIndex;
	private Set<LivingConditions> livingConditions = new HashSet<LivingConditions>();//
	private Set<EstimateStatus> statuses = new HashSet<EstimateStatus>();//每周自动生成健康评估表
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	@OneToMany
	public Set<Cases> getCases() {
		return Cases;
	}
	public void setCases(Set<Cases> cases) {
		Cases = cases;
	}
	@OneToOne
	public BasicIndex getBasicIndex() {
		return BasicIndex;
	}
	public void setBasicIndex(BasicIndex basicIndex) {
		BasicIndex = basicIndex;
	}
	@OneToMany
	public Set<LivingConditions> getLivingConditions() {
		return livingConditions;
	}
	public void setLivingConditions(Set<LivingConditions> livingConditions) {
		this.livingConditions = livingConditions;
	}
	@OneToMany
	public Set<EstimateStatus> getStatuses() {
		return statuses;
	}
	public void setStatuses(Set<EstimateStatus> statuses) {
		this.statuses = statuses;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
