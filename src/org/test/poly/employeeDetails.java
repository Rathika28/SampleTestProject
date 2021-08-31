package org.test.poly;

public class employeeDetails {
	public void empInfo() {
		System.out.println("Employee info:");
	}
		public void empInfo(int id){
			System.out.println("employee id is"+id);
		}
		public void empInfo(String name) {
			System.out.println("employee name is"+name);
		}
		public void empInfo(String email,long mobNo) {
			System.out.println("employee email is"+email);
			System.out.println("employee mobNo is"+mobNo);
		}
		public void empInfo(long mobNo,String email) {
	        System.out.println("employee email is"+email);
			System.out.println("employee mobNo is"+mobNo);
		}

	public static void main(String[] args) {
		employeeDetails e=new employeeDetails();
		e.empInfo();
		e.empInfo(1234);
		e.empInfo("Rathika");
		e.empInfo("athikaammu@gmrail.com",9159660408l);
		e.empInfo(9159660408l,"rathikaammu@gmrail.com");
		}

}
