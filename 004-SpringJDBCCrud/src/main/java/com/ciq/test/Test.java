package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.ciq.bean.Student;
import com.ciq.controller.controller;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
		controller contr = (controller) ap.getBean("stuCont");
		Student student = new Student(1, "krish", 54000.00);
//contr.save(student);
		// contr.findById(1);
		contr.Update(student);
	}
}
