package com.ciq.service;

import java.util.List;

import com.ciq.Pojo.Persons;

public interface PersonService {

	int save(Persons person);

	int Update(Persons persons);

	// int findbyid(Persons person);
	List<Persons> getAll();
}
