package lab3_test;

import junit.framework.TestCase;
import lab3.Ex9;

public class Ex9_Test extends TestCase {
	public void test() {
		assertEquals("Tổng tiến rút ra sau 12 tháng là: 1268241.7945625454",1268241.7945625454, Ex9.calculateFutureValue(1000000.0, 0.02, 12));
	}

}
