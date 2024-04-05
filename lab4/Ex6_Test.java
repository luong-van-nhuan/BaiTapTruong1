package lab4;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

public class Ex6_Test extends TestCase {
	private int testArr1[] = { 1, -3, 4 };
	private int testArr2[] = { 1, 2, 3 };
	private int testArrEmpty[] = {};

	public void testCheckForIncrease() {
		assertFalse("Dãy số đó không tăng dần", Ex6.checkForIncrease(testArr1));
		assertTrue("Dãy số đó có tăng dần", Ex6.checkForIncrease(testArr2));
		assertFalse("Mảng rỗng", Ex6.checkForIncrease(testArrEmpty));
	}

	public void testSortUpAscending() {
		List<Integer> expected = Arrays.asList(-3, 1, 4);
		List<Integer> result = Ex6.sortUpAscending(testArr1);
		assertEquals("Dãy số tăng dần: [-3, 1, 4]", expected, result);
		List<Integer> expected1 = Arrays.asList();
		List<Integer> result1 = Ex6.sortUpAscending(testArrEmpty);
		assertEquals("Mảng rỗng", expected1, result1);

	}
}
