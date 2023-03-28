package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.Pojo.Persons;
import com.ciq.dao.PeDao;

@Service
public class PersonServiceImpl implements PersonService  {

	@Autowired
	private PeDao da;

	@Override
	public int save(Persons person) {
		// TODO Auto-generated method stub
		return da.save(person);
	}

	@Override
	public int Update(Persons persons) {
		// TODO Auto-generated method stub
		return da.Update(persons);
	}

	@Override
	public List<Persons> getAll() {
		// TODO Auto-generated method stub
		return da.getAll();
	}
	
}
