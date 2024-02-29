package com.tcs.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // take all the annotations from persistance.Entity
public class Employee {

	@Id //specifies a primary key
	@GeneratedValue(strategy = GenerationType.AUTO) //Auto increment value, in new table give Identity & for exiting use AUTO
	private int eno;
	private String ename;
	private double sal;

	public Employee(int eno, String ename, double sal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public Employee() {

	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", sal=" + sal + "]";
	}

}
