package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterBased {
	
	@Test
	@Parameters({"email", "password"})
	  public void parametersTest(String email, String password) {
		  
		  System.out.println("test pass- email = " + email + " password = " + password);
	  }

}
