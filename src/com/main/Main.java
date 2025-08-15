package com.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.employeSystemImpl.EmployeeImpl;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		EmployeeImpl emp = new EmployeeImpl();
		
		while(flag) {
			System.out.println("\n****** WELCOME TO EMPLOYEE MANAGEMENT SYSTEM******");
			System.out.println("*                                                *");
			System.out.println("* 1] Add Employee Data                           *");
			System.out.println("* 2] Update Employee Data                        *");
			System.out.println("* 3] Delete Employee Data                        *");
			System.out.println("* 4] View Single Employee Data                   *");
			System.out.println("* 5] View All Employees Data                     *");
			System.out.println("* 6] Exit                                        *");
			System.out.println("**************************************************");
			
			
			int choice = -1;

           
            try {
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine(); 
                continue; 
            }
			
			switch(choice)
			{
			case 1 : 
					emp.insertData();
					break;
			case 2 : 
				emp.updateData();
				break;
				
			case 3 : 
				emp.deleteData();
				break;
			case 4 : 
				emp.getSingleData();
				break;
			case 5 : 
				emp.getAllData();
				break;
			case 6 : 
				flag = false;
				System.out.println("Thank you for visiting");
				break;
			default: System.out.println("Invalid choice(Enter between 1-6)");
				
					
			}
		}
	}

}
