package lab4;

import java.util.Arrays;

import junit.framework.TestCase;

public class Ex4_Test extends TestCase {
	private int [] testArr = { -2, -9, 4, 1, 2, 2, 6, -10, -9, -5 };
	private int[] testArrEmpty = {};

	public void testReverseOrder() {
		int[] expected = { -5, -9, -10, 6, 2, 2, 1, 4, -9, -2 };
		int[] result = Ex4.reverseOrder(testArr);
		assertEquals("Đảo ngược thứ tự của mảng: [-5, -9, -10, 6, 2, 2, 1, 4, -9, -2]", Arrays.toString(expected), Arrays.toString(result));
		int[] expected1 = {};
		int[] result1 = Ex4.reverseOrder(testArrEmpty);
		assertEquals("Mảng rỗng" , Arrays.toString(expected1), Arrays.toString(result1));
	}

}
