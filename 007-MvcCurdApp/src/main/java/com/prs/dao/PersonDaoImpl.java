package com.prs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.prs.pojo.Person;

@Repository
public class PersonDaoImpl implements PersonDao {

	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}



	@Override
	public List<Person> getAll() {

		String retrive="select * from person";
		List<Person> list = jt.query(retrive, new RowMapper<Person>() {
			
			@Override
			public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Person p=new Person();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setSalary(rs.getDouble(3));
				
				return p;
			}
		});
		
		return list;
	}

}
