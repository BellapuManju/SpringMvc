package com.ciq.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ciq.bean.Employe;

@Repository
public class Employedaoimpl implements EmployeDao{
	@Autowired
		private BasicDataSource basicDataSource;
	
		public void save(Employe employe) {
	    Connection con=null;
	    Statement st=null;
	    PreparedStatement pr=null;
	    try {
			con=basicDataSource.getConnection();
			pr=con.prepareStatement("insert into employe values(?,?,?)");
			pr.setInt(1, employe.getId());
			pr.setString(2,employe.getName());
			pr.setInt(3, employe.getPin());
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

}
