package javatest;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainClassTest {

	@Test
	public void testDebutTestCaseMethod() {
		
		MainClass tester = new MainClass();
		assertEquals(tester.DebutTestCaseMethod(), 0);
	}

}
