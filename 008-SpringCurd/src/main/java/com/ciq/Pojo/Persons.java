package com.ciq.Pojo;

public class Persons {
	
public int id;
public String name;
public double salary;
public Persons() {
	super();
	// TODO Auto-generated constructor stub
}
public Persons(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public int getId() {
	return id;
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
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Persons [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}
