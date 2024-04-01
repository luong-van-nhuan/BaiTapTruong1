package lab2;

import junit.framework.TestCase;

public class Ex4_Test extends TestCase {
	public void test() {
		assertEquals("Phương trình có 2 nghiệm phân biệt x1 = -5.5, x2 = -0.5", Ex4.solveQuadraticEquation(1, 3, -4));
		assertEquals("Phương trình vô nghiệm", Ex4.solveQuadraticEquation(1, 2, 3));
		assertEquals("Lỗi! phương trình bậc 2 a > 0", Ex4.solveQuadraticEquation(0, 2, 3));
		assertEquals("Phương trình có nghiệm kép x1 = x2 = 1.0", Ex4.solveQuadraticEquation(1, -2, 1));
	}

}
