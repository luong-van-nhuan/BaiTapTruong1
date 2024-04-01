package lab2;

import junit.framework.TestCase;

public class Ex2_Test extends TestCase {
	public void test() {
		assertTrue("2024 Là năm nhuận", Ex2.isLeapYear(2024));
		assertFalse("2019 Không phải là năm nhuận", Ex2.isLeapYear(2019));
		assertEquals("Có 29 trong tháng 2 năm 2024",29, Ex2.getDaysInMonth(2, 2024));
		assertEquals("Có 28 trong tháng 2 năm 2024",28, Ex2.getDaysInMonth(2, 2023));
		assertEquals("Có 31 trong tháng 3 năm 2024",31, Ex2.getDaysInMonth(3, 2024));
	}

}
