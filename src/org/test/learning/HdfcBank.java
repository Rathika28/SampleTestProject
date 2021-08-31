package org.test.learning;

public  class HdfcBank extends RbiBank {
	public void deposit() {
		System.out.println("deposit:4%");
		
	}
	public static void main(String[] args) {
		HdfcBank h=new HdfcBank();
		h.savings();
		h.deposit();
	

	}
	
}
