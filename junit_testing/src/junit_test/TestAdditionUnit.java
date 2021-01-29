package junit_test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdditionUnit {

	@Test
	public void test() {
		Addition a = new Addition();
		int add = a.additionTest();
		
		assertEquals(5, add);
	}

}
