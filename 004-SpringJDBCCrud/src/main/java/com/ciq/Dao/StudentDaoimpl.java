package com.ciq.Dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import com.ciq.bean.Student;
@Repository
public class StudentDaoimpl implements StudentDao {
	

	@Autowired
	private BasicDataSource basicDataSource;

	public void save(Student student) {
    Connection con=null;
     PreparedStatement pr=null;
    try {
		con=basicDataSource.getConnection();
		pr=con.prepareStatement("insert into employe values(?,?,?)");
		pr.setInt(1, student.getId());
		pr.setString(2,student.getName());
		pr.setDouble(3, student.getSalary());
		pr.executeUpdate();
		
				
		
	} catch (Exception e) {
        e.printStackTrace();	

	}
	finally {
		try {
			pr.close();
			con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		}
}
	

	public void findById(int id) {
		Connection con=null;
		Statement st=null;
		PreparedStatement pr=null;
		try {
			con=basicDataSource.getConnection();
		    pr=con.prepareStatement("Select*from student where id=?");
		    pr.setInt(1, id);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}


	public void update(Student student) {
		Connection con=null;
		PreparedStatement pr=null;
		
		try {
			con=basicDataSource.getConnection();
			pr=con.prepareStatement("update student set name=? ,salary=? where id=?");
			pr.setInt(3,student.getId());
			pr.setString(1, student.getName());
			pr.setDouble(2, student.getSalary());
			int i=pr.executeUpdate();
			System.out.println("Update Successfully"); 
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}	 
	
	


