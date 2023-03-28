package com.ciq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.Dao.StudentDaoimpl;
import com.ciq.bean.Student;

@Service
public class StudentServicimpl implements StudentService {
	@Autowired
	private StudentDaoimpl stud;

	public void save(Student student) {
		stud.save(student);
	}

	public void findById(Integer id) {
		stud.findById(id);
	}

	public void update(Student student) {
		stud.update(student);
	}
}
