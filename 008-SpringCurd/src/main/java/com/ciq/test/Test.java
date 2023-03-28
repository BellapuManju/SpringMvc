package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.Pojo.Persons;
import com.ciq.dao.Daoimpl;

public class Test {
public static void main(String[] args) {
	
	ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
	Daoimpl bean = ap.getBean(Daoimpl.class);
	Persons p=new Persons(3, "Ram", 56776.98);
	 System.out.println(bean.getAll());
	//System.out.println(bean.save(p));
//	System.out.println(bean.Update(p));
//System.out.println(bean.findbyid(p));
}
}
