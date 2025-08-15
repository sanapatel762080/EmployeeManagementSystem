package com.employeSystemImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.Configuration.Connectivity;
import com.employeSystemUnImpl.EmployeeUnimpl;

public class EmployeeImpl implements EmployeeUnimpl{

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void insertData() {
		String query = "insert into employee values(?,?,?,?);";
		Connection conn;
		try {
			conn = Connectivity.connect();
			PreparedStatement ps = conn.prepareStatement(query);
			System.out.println("Enter Employee Id:");
			int id = sc.nextInt();
			ps.setInt(1, id);
			sc.nextLine();
			
			System.out.println("Enter Employee Name");
			String name = sc.nextLine();
			ps.setString(2, name);
			
			System.out.println("Enter Employee Department");
			String dept = sc.nextLine();
			ps.setString(3, dept);
			
			System.out.println("Enter Employee Salary");
			double sal = sc.nextDouble();
			ps.setDouble(4, sal);
			
			ps.executeUpdate();
			System.out.println("Record Addedd Successfully....");

			ps.close();
			conn.close();
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	
}

	@Override
	public void updateData() {
		String query = "update employee set name = ?,dept = ?, salary = ? where id = ?";
		
		System.out.println("Enter Employee id");
		int id = sc.nextInt();
		sc.nextLine();
		
		try {
			Connection conn = Connectivity.connect();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(4, id);
			
			System.out.println("Enter Employee Name");
			String name = sc.nextLine();
		   ps.setString(1, name);
			
			System.out.println("Enter Employee Department");
			String dept = sc.nextLine();
			ps.setString(2, dept);
			
			System.out.println("Enter Employee Salary");
			double sal = sc.nextDouble();
			ps.setDouble(3, sal);
			
			ps.executeUpdate();
			System.out.println("Record Updated Successfully....");
			
			ps.close();
			conn.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteData() {
		String query = "delete from employee where id = ?";
		
		System.out.println("Enter Employee id");
		int id = sc.nextInt();
		sc.nextLine();

		
		try {
			Connection conn = Connectivity.connect();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			
			ps.executeUpdate();
			System.out.println("Recorde deleted successfully...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public void getSingleData() {
		String query = "select * from employee where id = ?";
		
		System.out.println("Enter id which you want to display the data");
		int id = sc.nextInt();
		sc.nextLine();

		try {
			Connection conn = Connectivity.connect();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getDouble(4));
			}
			
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

		

	@Override
	public void getAllData() {
		String query = "select * from employee";
		
		try {
			
			Connection conn = Connectivity.connect();
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" ");
				System.out.println(rs.getString(2)+" ");
				System.out.println(rs.getString(3)+" ");
				System.out.println(rs.getDouble(4)+" ");
				System.out.println("****************************");;
			}
			
			s.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
