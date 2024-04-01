package lab3_test;

import junit.framework.TestCase;
import lab2.Ex8;

public class Ex8_Test extends TestCase {
	public void testCalculateSum() {
		assertEquals("Tính tổng S = 15", 15, Ex8.calculateSum(5));
		assertEquals("Tính tổng S = 0",0, Ex8.calculateSum(0));
		assertEquals("Tính tổng S = 1",1, Ex8.calculateSum(1));
	}
	public void testCalculateFactorial() {
		assertEquals("Tính giai thừa n! = 120",120, Ex8.calculateSum(5));
		assertEquals("Tính tổng S = 1",1, Ex8.calculateSum(0));
		assertEquals("Tính tổng S = 1",1, Ex8.calculateSum(1));
	}
}
