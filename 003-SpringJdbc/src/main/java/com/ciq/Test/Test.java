package com.ciq.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.bean.Employe;
import com.ciq.controller.EmployeController;

public class Test {
public static void main(String[] args) {
	ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
	EmployeController employeController= (EmployeController) ap.getBean("empCont");
	Employe employe=new Employe(1, "KITTU", 54454);
	employeController.save(employe);
	
	
}
}
