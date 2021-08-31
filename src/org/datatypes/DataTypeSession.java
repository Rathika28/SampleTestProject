package org.datatypes;

import java.util.Scanner;

public class DataTypeSession {
	public void sample(){
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the employee id");
		int empId=s.nextInt();
		
		System.out.println("Enter the employee name");
		String empName=s.next();
		
		System.out.println("Enter the employee age");
		byte empAge=s.nextByte();
		
		System.out.println("Enter the employee emailId");
		String empEmailId=s.next();
		
		System.out.println("Enter the employee mobileNo");
		long empMobileNo=s.nextLong();
		
		System.out.println("emp id is"+empId);
		System.out.println("emp name is"+empName);
		System.out.println("emp age is"+empAge);
		System.out.println("emp emailid is"+empEmailId);
		System.out.println("emp mobileno is"+empMobileNo);
		}

	public static void main(String[] args) {
		DataTypeSession d=new DataTypeSession();
		d.sample();
		}

}
