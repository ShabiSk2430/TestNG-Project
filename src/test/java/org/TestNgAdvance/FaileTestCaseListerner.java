package org.TestNgAdvance;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FaileTestCaseListerner {
	
	@Test
	 public void Fruits() {
		 String a = "Apple";
		 Assert.assertTrue(a.equals("Apple"));
		 System.out.println("Pass");
		 
	 }
		@Test
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
		@Test
		 public void Fruits1() {
			 String a = "Banana";
			 Assert.assertTrue(a.equals("Banana"));
			 System.out.println("Pass");
			 
		 }
			@Test
		 public void Vegetable1() {
		
			 String b = "Beans";
			 Assert.assertTrue(b.equals("beans"));
			 System.out.println("fail");
	}
			@Test
	    public void NonVeg1() {
		    String c="Mutton";
		    Assert.assertTrue(c.equals("Mutton"));
			System.out.println("Pass");
			}
			


}
