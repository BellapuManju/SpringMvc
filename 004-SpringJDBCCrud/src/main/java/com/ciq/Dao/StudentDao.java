package com.ciq.Dao;

import com.ciq.bean.Student;

public interface StudentDao {
	void save(Student student);

	void findById(int id);

	void update(Student student);
}
