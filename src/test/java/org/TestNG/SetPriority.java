package org.TestNG;
import org.testng.annotations.Test;
public class SetPriority {
		
		@Test(priority=2,groups= {"smoke"})
		 public void Fruits() {
			 String a = "Apple";
			 System.out.println(a);
			 
		 }
			@Test(priority=3,groups= {"regression"})
		 public void Vegetable() {
			 String b = "Carrot";
			 System.out.println(b);
	}
			@Test(priority=1,groups= {"sanity"})
	    public void NonVeg() {
		    String c="Chicken";
			System.out.println(c);
			}
}
