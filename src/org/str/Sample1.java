package org.str;

public class Sample1 {

	public static void main(String[] args) {
		
		String s="WELCOME";
		String s1="welcome";
		
		boolean equals = s.equals(s1);
		System.out.println(equals);
		
		boolean equalsIgnorecase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnorecase);
		
		int compareTo = s.compareTo(s1);
		System.out.println(compareTo);
		
	}

}
