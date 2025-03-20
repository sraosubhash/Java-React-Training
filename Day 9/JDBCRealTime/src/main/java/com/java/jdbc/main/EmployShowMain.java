package com.java.jdbc.main;

import java.sql.SQLException;
import java.util.List;

import com.java.jdbc.dao.EmployDao;
import com.java.jdbc.dao.EmployDaoImp;
import com.java.jdbc.model.Employ;

public class EmployShowMain {
	
	public static void main(String[] args) {
		
		EmployDao dao = new EmployDaoImp();
		try {
			List<Employ> empList = dao.showEmploy();
			//System.out.println(empList.size());
			for (Employ employ : empList) {
				System.out.println(employ);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
