package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.bean.Student;
import com.ciq.dao.daoImpl;
@Service
public class serviceimpl implements servicein{
	@Autowired
	private daoImpl dao;
	
	public void save(Student student) {
		
	}

	public void update(Student studeng) {
		
	}

	public void DeleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
