package com.ciq.dao;

import java.util.List;

import com.ciq.Pojo.Persons;

public interface PeDao {
	
	int  save (Persons person);
	int Update(Persons persons);
	
	//int findbyid(Persons person);
	List<Persons> getAll();
	
	
}
