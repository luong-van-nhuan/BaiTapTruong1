package lab3_test;

import junit.framework.TestCase;
import lab3.Ex4;

public class Ex4_Test extends TestCase {
	public void testGreatestCommonDivisor() {
		assertEquals("Ước số chung lớn nhất là: 14", 14,Ex4.greatestCommonDivisor(28, 70));
	}
	public void testLeastCommonMultiple() {
		assertEquals("Bội số chung nhỏ nhất là: 140",140, Ex4.leastCommonMultiple(28, 70));
	}
}
