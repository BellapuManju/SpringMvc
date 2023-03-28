package com.ciq.service;

import com.ciq.bean.Student;

public interface StudentService {
 void save(Student student);
	 void findById(Integer id);
	 void update(Student student);
}
