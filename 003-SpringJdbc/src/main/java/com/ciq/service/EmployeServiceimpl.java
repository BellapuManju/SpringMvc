package com.ciq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.bean.Employe;
import com.ciq.dao.Employedaoimpl;
@Service
public class EmployeServiceimpl implements EmployeService{
	@Autowired
	private Employedaoimpl impl;
	
	public void save(Employe employe) {
		System.out.println("controller call ");
		impl .save(employe);
		
	}

}
