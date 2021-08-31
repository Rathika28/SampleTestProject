package org.test.learning1;

public class HdfcBank implements RbiBank {
	public static void main(String[] args) {
	HdfcBank h=new HdfcBank();
	h.savings();
	h.deposit();
	}
	@Override
	public void savings() {
		System.out.println("savings:3%");
		
	}

	@Override
	public void deposit() {
	  System.out.println("depdit:5%");
		
	}

}
