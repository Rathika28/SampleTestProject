package org.str;

public class Sample {

	public static void main(String[] args) {
		
		String s="WELCOME";
		
		int length = s.length();
		System.out.println(length);
		
		char charAt = s.charAt(3);
		System.out.println(charAt);
		
		int indexOf = s.indexOf('O');
		System.out.println(indexOf);
		
		int lastindexOf = s.lastIndexOf('E');
		System.out.println(lastindexOf);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		boolean startsWith = s.startsWith("WEL");
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("OME");
		System.out.println(endsWith);
		
		boolean contains = s.contains("COME");
		System.out.println(contains);
		
		String replace = s.replace('W','T');
		System.out.println(replace);
		
		String replaceall = s.replaceAll("COME","GO");
		System.out.println(replaceall);
		
		String trim = s.trim();
		System.out.println(trim);
		
		String substring= s.substring(3);
		System.out.println(substring);
		
		String substring2= s.substring(1,5);
		System.out.println(substring2);
		
	}
		
	}


