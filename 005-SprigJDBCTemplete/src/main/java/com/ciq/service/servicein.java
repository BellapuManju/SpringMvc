package com.ciq.service;

import java.util.List;

import com.ciq.bean.Student;

public interface servicein {
 void save(Student student);
 void update(Student studeng);
 void DeleteById(int id);
 List <Student>findAll();
}
