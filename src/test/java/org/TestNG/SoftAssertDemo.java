package org.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftAssertDemo {
		@Test
		public void group() {
		SoftAssert s = new SoftAssert();
			String a="Shabi";
			s.assertTrue(a.equals("sabi"));
			s.assertFalse(a.equals("Shabi"));
			System.out.println("Pass");
			s.assertAll();
		}

		@Test
		public void group1() {
			String a="Shabi";
			Assert.assertTrue(a.equals("sabi"));
			System.out.println("Fail");
			Assert.assertFalse(a.equals("Shabi"));
			System.out.println("Pass");
		}
}

