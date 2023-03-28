package com.ciq.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ciq.model.Workers;
@Repository
@Transactional
public class Daoimpl implements Dao{
@Autowired
private HibernateTemplate hibernateTemplate;

	public void save(Workers workers) {
		hibernateTemplate.save(workers);		
	}
	
	public List<Workers> getWorkers() {
		return hibernateTemplate.loadAll(Workers.class);
	}

	public void update(Workers workers) {
		hibernateTemplate.update(workers);
	}

	public Workers getById(long id) {
		return hibernateTemplate.get(Workers.class, id);
	}

	public void delete(long id) {
		hibernateTemplate.delete(getById(id));		

	}

	

}
