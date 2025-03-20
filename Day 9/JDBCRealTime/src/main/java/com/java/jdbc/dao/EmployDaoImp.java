package com.java.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.jdbc.model.Employ;
import com.java.jdbc.model.gender;
import com.java.jdbc.util.ConnectionHelper;

public class EmployDaoImp implements EmployDao{
	
	Connection connection;
	PreparedStatement pst;

	@Override
	public List<Employ> showEmploy() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd  = "select * from employ";
		pst = connection.prepareCall(cmd);
		ResultSet rs = pst.executeQuery();
		List<Employ> empList = new ArrayList<Employ>();
		Employ employ = null;
		while(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("ename"));
			employ.setGender(gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
			empList.add(employ);
					
		}
		return empList;
	}

	@Override
	public Employ searchEmploy(int empno) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Select * from Employ where empno = ?";
		pst= connection.prepareCall(cmd);
		pst.setInt(1, empno);
		ResultSet rs = pst.executeQuery();
		Employ employ = null;
		if(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("ename"));
			employ.setGender(gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
			
		}
		return employ;
	}

	@Override
	public String addEmploy(Employ employ) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "insert into Employ values(?,?,?,?,?,?)";
		pst = connection.prepareCall(cmd);
		pst.setInt(1, employ.getEmpno());
		pst.setString(2, employ.getName());
		pst.setString(3, employ.getGender().toString());
		pst.setString(4, employ.getDept());
		pst.setString(5, employ.getDesig());
		pst.setDouble(6, employ.getBasic());
		pst.executeUpdate();
		
		return "***Employ record inserted***";
	}
	

}
