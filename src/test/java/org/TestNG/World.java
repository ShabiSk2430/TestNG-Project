package org.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class World {
	@Parameters({"username"})
	@Test
	public void group(String b) {
		
		System.out.println(b);	
	}
	@Parameters({"password"})
	@Test
	public void group1(String a) {
		System.out.println(a);
	}
	@Parameters({"browser"})
	@Test
 public void group2(String s) {
	
	 System.out.println(s);
 }
}
