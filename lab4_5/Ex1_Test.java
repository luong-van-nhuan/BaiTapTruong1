package lab4_5;

import junit.framework.TestCase;

public class Ex1_Test extends TestCase {
	public void testLargestElementPosition() {
		int arr[] = { 34, 65, 85, 43, 84, 97, 33, 56 };
		assertEquals("Vị trí phần tử lớn nhất của dãy là: 6", 6, Ex1.largestElementPosition(arr));
	}

	public void testLargestElementValue() {
		int arr[] = { 34, 65, 85, 43, 84, 97, 33, 56 };
		assertEquals("Giá trị phần tử lớn nhất của dãy là: 97", 97, Ex1.largestElementValue(arr));
	}

	public void testSmallestElementPosition() {
		int arr[] = { 34, 65, 85, 43, 84, 97, 33, 56 };
		assertEquals("Vị trí phần tử lớn nhỏ của dãy là: 7", 7, Ex1.smallestElementPosition(arr));
	}

	public void testSmallestElementValue() {
		int arr[] = { 34, 65, 85, 43, 84, 97, 33, 56 };
		assertEquals("Giá trị phần tử lớn nhỏ của dãy là: 33", 33, Ex1.smallestElementValue(arr));
	}

	public void testSumOfElements() {
		int arr[] = { 34, 65, 85, 43, 84, 97, 33, 56 };
		assertEquals("Tổng các phần tử của dãy là: 497", 497, Ex1.sumOfElements(arr));
	}
}
