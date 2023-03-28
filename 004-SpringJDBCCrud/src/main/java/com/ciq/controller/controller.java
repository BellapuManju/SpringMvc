package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import com.ciq.Dao.StudentDaoimpl;
import com.ciq.bean.Student;
import com.ciq.service.StudentService;
import com.ciq.service.StudentServicimpl;

@Controller("stuCont")
public class controller {
	@Autowired
	private StudentService stude;

	public void save(Student student) {
		stude.save(student);
	}

	public void findById(int id) {
		stude.findById(id);
	}

	public void Update(Student student) {
		stude.update(student);
	}
}
