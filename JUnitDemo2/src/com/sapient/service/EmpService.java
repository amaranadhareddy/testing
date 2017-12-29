package com.sapient.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sapient.test.EmpTest;
import com.sapient.vo.Emp;

public class EmpService {
	
	public  EmpService() {
	}
		
	
	public Emp getEmployee(int eid) throws NotFoundException, ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","Sapient@123");
		String str = "select eid,ename,sal from employee where eid=?";
		PreparedStatement st = conn.prepareStatement(str);
		st.setInt(1, eid);
		ResultSet rs = st.executeQuery();
		String ename=null;
		double sal=0;
		eid=0;
		while(rs.next()){
			eid = rs.getInt(1);
			ename = rs.getString(2);
			sal = rs.getDouble(3);
		}
		if(eid==0)
			throw new NotFoundException();
		
		else{
			Emp emp = new Emp(eid,ename,sal);
			return emp;
		}
	}
}
