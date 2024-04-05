package lab4;

import junit.framework.TestCase;

public class Ex3_Test extends TestCase {
	private int testArr[] = { -4, 7, 4, 4, -6, 0, 3, 7, -5, 6, 0, -1 };
	private int testArrEmpty[] = {};

	public void testCountNegativeNumbers() {
		assertEquals("Có 4 số âm", 4, Ex3.countNegativeNumbers(testArr));
		assertEquals("Mảng rỗng", 0, Ex3.countNegativeNumbers(testArrEmpty));
	}

	public void testCountPositiveNumbers() {
		assertEquals("Có 6 số dương", 6, Ex3.countPositiveNumbers(testArr));
		assertEquals("Mảng rỗng", 0, Ex3.countPositiveNumbers(testArrEmpty));
	}

	public void testCountZero() {
		assertEquals("Có 2 số không", 2, Ex3.countZero(testArr));
		assertEquals("Mảng rỗng", 0, Ex3.countZero(testArrEmpty));
	}

	public void testLargestNegativeNumber() {
		assertEquals("Số âm lớn nhất là: -1", -1, Ex3.largestNegativeNumber(testArr));
		assertEquals("Mảng rỗng", 0, Ex3.largestNegativeNumber(testArrEmpty));
	}

	public void testLargestPositiveNumber() {
		assertEquals("Số dương nhỏ nhất là: 3", 3, Ex3.largestPositiveNumber(testArr));
		assertEquals("Mảng rỗng", 0, Ex3.largestPositiveNumber(testArrEmpty));
	}

	public void testTheNegativeSumIsEqualToThePositiveSum() {
		int testArr1[] = { -4, 7, 4, -4, -6, 0, 3, 7, -5, 0, -1, -1 };
		assertFalse("|Tổng âm|Không bằng tổng dương", Ex3.theNegativeSumIsEqualToThePositiveSum(testArr));
		assertTrue("|Tổng âm|Có bằng tổng dương", Ex3.theNegativeSumIsEqualToThePositiveSum(testArr1));
		assertFalse("Mảng rỗng", Ex3.theNegativeSumIsEqualToThePositiveSum(testArrEmpty));
	}
}
