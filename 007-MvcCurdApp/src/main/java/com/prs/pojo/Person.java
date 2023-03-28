package com.prs.pojo;

public class Person {
	
	private int id;
	
	private String name;
	
	private double salary;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public synchronized double getSalary() {
		return salary;
	}

	public synchronized void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
