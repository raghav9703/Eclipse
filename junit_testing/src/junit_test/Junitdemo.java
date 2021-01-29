package junit_test;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

public class Junitdemo {
	
	

	@BeforeClass
	public void test1() {
		System.out.println("This is Test1");
		
	}
	
	@Test
	public void test2() {
		System.out.println("This is Test2");
	
	}
	@AfterClass
	public void test3() {
		System.out.println("This is Test3");
		
	}
}
