package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ciq.bean.Student;
import com.ciq.service.serviceimpl;
@Controller("control")
public class controller {
	@Autowired
	private serviceimpl serv;
	
 public void save(Student student) {
	serv.save(student);
}

public void update(Student student) {
	serv.update(student);
}

public void DeleteById(Student stu) {	
}
List<Student> findAll() {
	return serv.findAll();
}
}
