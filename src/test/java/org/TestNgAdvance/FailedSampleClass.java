package org.TestNgAdvance;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedSampleClass {
		@Test
		 public void Fruits() {
			 String a = "Apple";
			 Assert.assertTrue(a.equals("Apple"));
			 System.out.println("Pass");
			 
		 }
			@Test(retryAnalyzer=RetryFailedTC.class)
		 public void Vegetable() {
			 String b = "Carrot";
			 Assert.assertTrue(b.equals("carrot"));
			 System.out.println("fail");
	}
			@Test
	    public void NonVeg() {
		    String c="Chicken";
		    Assert.assertTrue(c.equals("Chicken"));
			System.out.println("Pass");
			}
}






