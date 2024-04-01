package lab3_test;

import junit.framework.TestCase;
import lab3.Ex2;

public class Ex2_Test extends TestCase {
	public void testCountNumbers() {
		assertEquals("Số chữ số của số nguyên 34 là 2",2, Ex2.countNumbers(34));
	}
	public void testReverseNumbers() {
		assertEquals("Số đảo ngược của số 34 là 43", 43, Ex2.reverseNumbers(34));
	}
}
