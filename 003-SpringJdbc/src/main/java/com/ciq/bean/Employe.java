package com.ciq.bean;

public class Employe {
private int id;
private String name;
private int pin;
public Employe() {
	super();
	// TODO Auto-generated constructor stub
}
public Employe(int id, String name, int pin) {
	super();
	this.id = id;
	this.name = name;
	this.pin = pin;
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
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
@Override
public String toString() {
	return "Employe [id=" + id + ", name=" + name + ", pin=" + pin + "]";
}

}
