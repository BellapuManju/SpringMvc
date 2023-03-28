package com.ciq.bean;

public class Student {
private int id;
private String name;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public synchronized int getId() {
	return id;
}
public synchronized void setId(int id) {
	this.id = id;
}
public synchronized String getName() {
	return name;
}
public synchronized void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}


}
