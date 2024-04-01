package lab4_5;

import junit.framework.TestCase;

public class Ex2_Test extends TestCase {
	public void testCountTheLargestElement() {
		int[] arr = { 34, 87, 75, 85, 35, 86, 54, 87, 54, 87 };
		assertEquals("Phần tử lớn nhất xuất hiện trong dãy 3 lần", 3, Ex2.countTheLargestElement(arr));
	}

}
