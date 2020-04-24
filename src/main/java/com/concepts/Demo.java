package com.concepts;

public class Demo {

	public static void main(String[] args) {

		Demo a = new Demo();
		String receivedFromMethod = a.driverMethod("gopal");
		System.out.println(receivedFromMethod);

	}

String driverMethod(String name){
	return "khanal"; 
}
	


}
