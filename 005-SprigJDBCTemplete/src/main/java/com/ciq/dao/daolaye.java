package com.ciq.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ciq.bean.Student;

public interface daolaye {
 void  save(Student student);
 void update(Student student);
 void deleteById(int id);
 List<Student> findAll();
}
