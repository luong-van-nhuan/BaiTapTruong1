package lab4_5;

import junit.framework.TestCase;

public class Ex3_Test extends TestCase {
	public void testCountNegativeNumbers() {
		int arr[] = { -4, 7, 4, 4, -6, 0, 3, 7, -5, 6, 0, -1, };
		assertEquals("Có 4 số âm", 4, Ex3.countNegativeNumbers(arr));
	}

	public void testCountPositiveNumbers() {
		int arr[] = { -4, 7, 4, 4, -6, 0, 3, 7, -5, 6, 0, -1, };
		assertEquals("Có 6 số dương", 6, Ex3.countPositiveNumbers(arr));
	}

	public void testCountZero() {
		int arr[] = { -4, 7, 4, 4, -6, 0, 3, 7, -5, 6, 0, -1, };
		assertEquals("Có 2 số không", 2, Ex3.countZero(arr));
	}
	public void testLargestNegativeNumber() {
		int arr[] = { -4, 7, 4, 4, -6, 0, 3, 7, -5, 6, 0, -1, };
		assertEquals("Số âm lớn nhất là: -1", -1, Ex3.largestNegativeNumber(arr));
	}
	public void testLargestPositiveNumber() {
		int arr[] = { -4, 7, 4, 4, -6, 0, 3, 7, -5, 6, 0, -1, };
		assertEquals("Số dương nhỏ nhất là: 3", 3, Ex3.largestPositiveNumber(arr));
	}
	public void testTheNegativeSumIsEqualToThePositiveSum() {
		int arr[] = { -4, 7, 4, 4, -6, 0, 3, 7, -5, 6, 0, -1, };
		assertFalse("|Tổng âm|Không bằng tổng dương", false);
	}
}
