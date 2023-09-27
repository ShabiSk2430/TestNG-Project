package org.TestNG;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test(dependsOnMethods ="google" )
	 public void login() {
		
		 System.out.println("login");
		 
	 }
		@Test(dependsOnMethods ="login" )
	 public void password() {
	
		 System.out.println("password");
}
		@Test
   public void google() {
	  
		System.out.println("google");
		}

}
