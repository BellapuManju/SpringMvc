package com.ciq.clint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.Dao.Daoimpl;
import com.ciq.model.Workers;

public class Test {
public static void main(String[] args) {
	Workers w=new Workers();
    w.setId(101);
    w.setName("vani");
 System.out.println(w);
ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
Daoimpl da=ap.getBean(Daoimpl.class);
//da.save(w);




}
}
