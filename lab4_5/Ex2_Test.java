package lab4_5;

import junit.framework.TestCase;

public class Ex2_Test extends TestCase {
	private int testArr[] = { 34, 87, 75, 85, 35, 86, 54, 87, 54, 87 };
	private int testArrEmpty[] = {};
	public void testCountTheLargestElement() {
		assertEquals("Phần tử lớn nhất xuất hiện trong dãy 3 lần", 3, Ex2.countTheLargestElement(testArr));
		assertEquals("Mảng rỗng", -1, Ex2.countTheLargestElement(testArrEmpty));
	}

}
