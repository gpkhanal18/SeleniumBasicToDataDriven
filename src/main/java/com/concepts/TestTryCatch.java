package com.concepts;

public class TestTryCatch {
	
	public static void main(String[] args) {
		
		try {
			String s = "goaplkhanal";
			System.out.println(s.charAt(5));
		}
		catch(NullPointerException e) {
			System.out.println("exception catched");
		}
		finally {
			System.out.println("inside finally");
		}
		
		
		
	
		
		
	}

}
