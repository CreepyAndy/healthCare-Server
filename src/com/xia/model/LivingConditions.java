package com.xia.model;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="t_living_conditions")
public class LivingConditions {
	private int id;
	private double sleepTime;
	private Time breakfast;//00:00:00未吃早饭
	private boolean ifSmoke;
	private boolean ifDrink;
	private Time exerciseEveryWeek;//每周锻炼时间
	private double intakeSalt;
	private Employee employee;
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSleepTime() {
		return sleepTime;
	}
	public void setSleepTime(double sleepTime) {
		this.sleepTime = sleepTime;
	}
	public Time getBreakfast() {
		return breakfast;
	}
	public void setBreakfast(Time breakfast) {
		this.breakfast = breakfast;
	}
	public boolean isIfSmoke() {
		return ifSmoke;
	}
	public void setIfSmoke(boolean ifSmoke) {
		this.ifSmoke = ifSmoke;
	}
	public boolean isIfDrink() {
		return ifDrink;
	}
	public void setIfDrink(boolean ifDrink) {
		this.ifDrink = ifDrink;
	}
	public Time getExerciseEveryWeek() {
		return exerciseEveryWeek;
	}
	public void setExerciseEveryWeek(Time exerciseEveryWeek) {
		this.exerciseEveryWeek = exerciseEveryWeek;
	}
	public double getIntakeSalt() {
		return intakeSalt;
	}
	public void setIntakeSalt(double intakeSalt) {
		this.intakeSalt = intakeSalt;
	}
	@ManyToOne
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
