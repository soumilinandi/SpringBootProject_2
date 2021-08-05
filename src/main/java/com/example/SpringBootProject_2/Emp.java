package com.example.SpringBootProject_2;

public class Emp {
	int id;
	String ename;
	double esal;

	public Emp() {
	}

	public Emp(int id, String ename, double esal) {
		this.id = id;
		this.ename = ename;
		this.esal = esal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public String toString() {
		return "Id=" + id + ", Name=" + ename + ", Salary=" + esal;
	}

}
