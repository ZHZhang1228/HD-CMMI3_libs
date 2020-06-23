package com.mucfc.model;

import java.io.Serializable;

/**
 * 雇员信息类
 * 
 * @author lin
 * @time 2018.12.19
 */
public class Employeer {

	private Integer employeer_id;
	private String employeer_name;
	private Integer employeer_age;
	private String employeer_department;
	private String employeer_worktype;

	public Employeer() {
		super();
	}

	public Integer getEmployeer_id() {
		return employeer_id;
	}

	public void setEmployeer_id(Integer employeer_id) {
		this.employeer_id = employeer_id;
	}

	public String getEmployeer_name() {
		return employeer_name;
	}

	public void setEmployeer_name(String employeer_name) {
		this.employeer_name = employeer_name;
	}

	public Integer getEmployeer_age() {
		return employeer_age;
	}

	public void setEmployeer_age(Integer employeer_age) {
		this.employeer_age = employeer_age;
	}

	public String getEmployeer_department() {
		return employeer_department;
	}

	public void setEmployeer_department(String employeer_department) {
		this.employeer_department = employeer_department;
	}

	public String getEmployeer_worktype() {
		return employeer_worktype;
	}

	public void setEmployeer_worktype(String employeer_worktype) {
		this.employeer_worktype = employeer_worktype;
	}

	@Override
	public String toString() {
		return "Employeer [employeer_id=" + employeer_id + ", employeer_name=" + employeer_name + ", employeer_age="
				+ employeer_age + ", employeer_department=" + employeer_department + ", employeer_worktype="
				+ employeer_worktype + "]";
	}

}
