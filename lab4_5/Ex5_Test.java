package lab4_5;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

public class Ex5_Test extends TestCase {
	private int testArr[] = { 5, 8, 6, 4, 7, 49, 7, -4, -57, -3, 47, 22, 13, 7, 0, -4 };
	private int testArrEmpty[] = {};
	private int testX = 7;

	public void testThatNumberAppears() {
		assertTrue("số 7 có xuất hiện trong dãy", Ex5.thatNumberAppears(testArr, testX));
		assertFalse("số 7 không xuất hiện trong dãy", Ex5.thatNumberAppears(testArrEmpty, testX));
	}

	public void testTheNumberOfOccurrences() {
		assertEquals("Số 7 xuất hiện 3 lần trong dãy", 3, Ex5.theNumberOfOccurrences(testArr, testX));
		assertEquals("Số 7 xuất hiện 0 lần trong dãy", 0, Ex5.theNumberOfOccurrences(testArrEmpty, testX));
	}

	public void testLocationAppears() {
		List<Integer> expected = Arrays.asList(5,7,14);
		assertEquals("Số 7 xuất hiện tại vị trí thứ [5, 7, 14]", expected, Ex5.locationAppears(testArr, testX));
		List<Integer> expected1 = Arrays.asList();
		assertEquals("Số 7 không xuất hiện trong mảng trống", expected1,Ex5.locationAppears(testArrEmpty, testX));
	}
	public void testDeleteAllXElements() {
		List<Integer> expected = Arrays.asList(5, 8, 6, 4, 49, -4, -57, -3, 47, 22, 13, 0, -4);
		List<Integer> result = Ex5.deleteAllXElements(testArr, testX);
		assertEquals("Mảng ban đầu: [ 5, 8, 6, 4, 7, 49, 7, -4, -57, -3, 47, 22, 13, 7, 0, -4 ", expected, result);
		List<Integer> expected1 = Arrays.asList();
		List<Integer> result1 = Ex5.deleteAllXElements(testArrEmpty, testX);
		assertEquals("Mảng rỗng", expected1,result1);
	}

}
