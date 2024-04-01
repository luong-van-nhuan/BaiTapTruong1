package lab2;

import junit.framework.TestCase;

public class Ex1_Test extends TestCase {
	public void test() {
		assertEquals(3.2, Ex1.findMax(3.2,1.2));
		assertEquals(4.2, Ex1.findMax(4.2, 2.5));
		assertEquals(8.4, Ex1.findMax(8.4, 5.3));
	}
}
