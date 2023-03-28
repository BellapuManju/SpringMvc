package com.ciq.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.bean.Student;
import com.ciq.controller.controller;

public class Test {
public static void main(String[] args) {
	ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
	controller con=(controller) ap.getBean("control");
	Student stu=new Student(223, "kouju");
	//con.save(stu);
	con.update(stu);
	con.DeleteById(stu);
	System.out.println("Success");
}
}
