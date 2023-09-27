package org.TestNG;

import org.testng.annotations.*;

public class Sample {
	@Test(groups= {"sanity"})
 public void test() {
	 String a = "Apple";
	 System.out.println(a);
	 
 }
	@Test(groups= {"regression"})
 public void test1() {
	 String b = "Orange";
	 System.out.println(b);
	 
 }
	@Test(groups= {"smoke"})
public void One() {
	System.out.println("BS");
}
	@Test(groups= {"regression"})
public void Two() {
	System.out.println("AS");
}
	@Test(groups= {"smoke"})
public void Three() {
	System.out.println("BC");
}
	@Test(groups= {"sanity"})
public void Four() {
	System.out.println("AC");
}
	@Test(groups= {"regression"})
public void Five() {
	System.out.println("BT");
}
	@Test(groups= {"smoke"})
public void Six() {
	System.out.println("AT");
}
	@Test(groups= {"sanity"})
public void Seven() {
	System.out.println("BM");
}
	@Test(groups= {"regression"})
public void Eight() {
	System.out.println("AM");
}
	@Test(groups= {"sanity"})
public void Nine() {
	System.out.println("BG");
}
	@Test(groups= {"regression"})
public void ten() {
	System.out.println("AG");
}

}
