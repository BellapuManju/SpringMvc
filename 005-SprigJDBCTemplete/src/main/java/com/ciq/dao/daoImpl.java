package com.ciq.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ciq.bean.Student;
@Repository
public class daoImpl implements daolaye{
	@Autowired
     JdbcTemplate jdbcTemplate;
	public void save(Student student) {
	 jdbcTemplate.update("insert into students values(?,?)",
			 new Object[] {student.getId(),student.getName()});
	}
	public void update(Student student) {
		jdbcTemplate.update("update students set name=?,set id=?",
				new  Object[] {student.getName(),student.getId()});	
	}
	public void deleteById(int id) {
jdbcTemplate.update("delete *from students where id=?",
		new Object[]{id});		
	}
	//ROWMAPPER
	public List<Student> findAll() {
		// TODO Auto-generated method stub
return jdbcTemplate.query("select *from student ",new BeanPropertyRowMapper(Student.class));
	}

	
}

