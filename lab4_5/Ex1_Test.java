package lab4_5;

import junit.framework.TestCase;

public class Ex1_Test extends TestCase {
	private int testArr[] = { 34, 65, 85, 43, 84, 97, 33, 56 };
	private int testArrEmpty[] = {};
	public void testLargestElementPosition() {
		assertEquals("Vị trí phần tử lớn nhất của dãy là: 6", 6, Ex1.largestElementPosition(testArr));
		assertEquals("Mảng rỗng", -1, Ex1.largestElementPosition(testArrEmpty));
	}

	public void testLargestElementValue() {
		assertEquals("Giá trị phần tử lớn nhất của dãy là: 97", 97, Ex1.largestElementValue(testArr));
		assertEquals("Mảng rỗng", -1, Ex1.largestElementValue(testArrEmpty));
	}

	public void testSmallestElementPosition() {
		
		assertEquals("Vị trí phần tử lớn nhỏ của dãy là: 7", 7, Ex1.smallestElementPosition(testArr));
		assertEquals("Mảng rỗng", -1, Ex1.smallestElementPosition(testArrEmpty));
	}

	public void testSmallestElementValue() {
		
		assertEquals("Giá trị phần tử lớn nhỏ của dãy là: 33", 33, Ex1.smallestElementValue(testArr));
		assertEquals("Mảng rỗng", -1, Ex1.smallestElementValue(testArrEmpty));
	}

	public void testSumOfElements() {
		assertEquals("Tổng các phần tử của dãy là: 497", 497, Ex1.sumOfElements(testArr));
		assertEquals("Mảng rỗng", -1, Ex1.sumOfElements(testArrEmpty));

	}
}
