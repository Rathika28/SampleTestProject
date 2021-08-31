package org.test.tcs;

public class courseDetails {

	public void javaCourse() {
	System.out.println("Java Course");
     }
	
	private void oracleCourse() {
	System.out.println("Oracle Course");
    }
	
	public static void main(String[] args) {
	courseDetails c=new courseDetails();
		c.javaCourse();
		c.oracleCourse();
	}

}
