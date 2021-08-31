package org.text.learn;

public class HdfcBank implements AxisBank,RbiBank {
	public static void main(String[] args) {
		HdfcBank h=new HdfcBank();
		h.savings();
		h.deposit();
		h.current();

	}

	@Override
	public void savings() {
	   System.out.println("savings:2%");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit:3%");
		
	}

	@Override
	public void current() {
		System.out.println("current:5%");
		
	}

}
