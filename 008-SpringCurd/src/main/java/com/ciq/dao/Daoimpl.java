package com.ciq.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ciq.Pojo.Persons;
import com.ciq.queries.MysqlQueries;

@Repository
@Primary
public class Daoimpl implements PeDao {

	@Autowired
	private JdbcTemplate jd;

	@Override
	public List<Persons> getAll() {
		List<Persons> list = jd.query(MysqlQueries.getAll, new RowMapper<Persons>() {
			@Override
			public Persons mapRow(ResultSet rs, int rowNum) throws SQLException {

				Persons p = new Persons();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setSalary(rs.getDouble(3));

				return p;
			}
		});

		return list;
	}

	@Override
	public int save(Persons person) {
		String insert = "insert into  Asst values(?,?,?)";
		int in = jd.update(insert, new Object[] { person.getId(), person.getName(), person.getSalary() });
		return in;
	}

	@Override
	public int Update(Persons persons) {
		String update = "update Asst set id=?";
		int i = jd.update(update, new Object[] { persons.getId() });
		return i;

	}

//	public int findbyid(Persons person) {
//		String update="select*from  Asst findbyid=?"; 
//		int in=jd.update(update,new Object[] {person.getId()});
//		return in;
//	}

}
