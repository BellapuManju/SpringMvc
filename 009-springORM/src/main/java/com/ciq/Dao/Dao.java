package com.ciq.Dao;

import java.util.List;

import com.ciq.model.Workers;

public interface Dao {
	void save(Workers workers);

	void update(Workers workers);

	List<Workers> getWorkers();

	Workers getById(long id);

	void delete(long id);}
