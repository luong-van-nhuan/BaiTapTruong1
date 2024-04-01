package lab2;

import junit.framework.TestCase;

public class Ex3_Test extends TestCase {
	public void test() {
		assertEquals("Phương trình vô số nghiệm",Ex3.solveLinearEquation(0, 0));
		assertEquals("Phương trình vô nghiệm",Ex3.solveLinearEquation(0, 54.3));
		assertEquals("Phương trình có nghiệm x = 0.0", Ex3.solveLinearEquation(-43.3, 0));
		assertEquals("Phương trình có nghiệm x = -2.0", Ex3.solveLinearEquation(2.0, 4.0));
	}

}
