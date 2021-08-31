package org.test.hcl;
public class adminDetails extends companyDetails {
	
public void adminId(){
	System.out.println("admin id is: 1237");
	}

public void adminName() {
	System.out.println("admin name is: Pragathi");
	}

public static void main(String[] args) {
	adminDetails ad=new adminDetails();
	ad.companyId();
	ad.companyName();
	ad.empId();
	ad.empName();
	ad.clientId();
	ad.clientName();
	ad.adminId();
	ad.adminName();}}
