package org.test.poly;

public class RblBank extends HdfcBank {
	public void Savings() {
		System.out.println("Saving:2%");
	}
	public void Current() {
		System.out.println("Current:3%");
	}

	public static void main(String[] args) {
		RblBank r=new RblBank();
		r.Current();
		r.Savings();
		r.deposit();
		}

}
