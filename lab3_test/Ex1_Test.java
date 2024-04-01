package lab3_test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.TestCase;
import lab3.Ex1;

public class Ex1_Test extends TestCase {
	public void testCalculateSum() {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,8));
		assertEquals("Tổng: 23.0", 23.0, Ex1.calculateSum(list));
	}
	
}
