package org.learning;

import java.util.Scanner;

public class DataTypesSession1 {
	public static void disk() {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the student id");
		int stdId=s.nextInt();
		System.out.println("Enter the student name");
		String stdName=s.next();
		System.out.println("Enter the student mark1");
		int stdMark1=s.nextInt();
		System.out.println("Enter the student mark2");
		int stdMark2=s.nextInt();
		System.out.println("Enter the student mark3");
		int stdMark3=s.nextInt();
		System.out.println("Enter the student mark4");
		int stdMark4=s.nextInt();
		System.out.println("Enter the student mark5");
		int stdMark5=s.nextInt();
		System.out.println("Enter the students total marks");
		double tot=stdMark1+stdMark2+stdMark3+stdMark4+stdMark5;
		double avg=tot/5;
		
		System.out.println("student id is="+stdId);
		System.out.println("student name is="+stdName);
		System.out.println("student mark1 is="+stdMark1);
		System.out.println("student mark2 is="+stdMark2);
		System.out.println("student mark3 is="+stdMark3);
		System.out.println("student mark4 is="+stdMark4);
		System.out.println("student mark5 is="+stdMark5);
		System.out.println("students total marks is="+tot);
		System.out.println("Student Average Marks is "+avg);
	}
	
	public static void main(String[] args) {
		disk();
		
	}

}
