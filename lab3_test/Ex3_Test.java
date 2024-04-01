package lab3_test;

import junit.framework.TestCase;
import lab3.Ex3;

public class Ex3_Test extends TestCase {
	public void test() {
		assertEquals("Sau 27 năm tuổi cha bằng 2 lần tuổi con", 27, Ex3.calculateAge(35, 4));
	}
}
