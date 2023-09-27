package org.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCase {
	public class Assertion {
		@Test
		public void testPageTitle()
		{
			String ex="HomeTown";
			String ac="HomeTown";
					
			Assert.assertEquals(ex, ac);
			if(ex.equals(ac))		
			System.out.println("Pass");
		else 
			System.out.println("Fail");
			
		}
		
		@Test
		public void assertTrue()
		{
			String s="Shabi";
			Assert.assertTrue(s.equals("Shabi"));
			System.out.println("Pass");
			
		}
		
		@Test

		public void assertFalse()
		{
			String s="Apple World";
			Assert.assertFalse(s.equals("apple World"));
			System.out.println("Pass");
		}
		
		
		
		

	}

}
