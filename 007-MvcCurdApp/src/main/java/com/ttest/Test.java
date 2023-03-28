package com.ttest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prs.dao.PersonDaoImpl;
import com.prs.pojo.Person;

public class Test {
public static void main(String[] args) {
	ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
	PersonDaoImpl p=(PersonDaoImpl) ap.getBean("Dao");
	System.out.println(p.getAll());
}
}