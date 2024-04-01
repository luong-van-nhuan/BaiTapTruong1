package lab2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex10_Test {

	@Test
	void testIsValidDate() {
		assertTrue(Ex10.isValidDate(23, 10, 2024));
		assertFalse(Ex10.isValidDate(32, 10, 2024));
		assertEquals(true, Ex10.isValidDate(25, 12, 2018));
	}

	@Test
	void testIsLeapYear() {
		assertEquals(true,Ex10.isLeapYear(2024));
		assertEquals(false,Ex10.isLeapYear(2018));
	}
	@Test
	void testGetMaxDays() {
		assertEquals(31,Ex10.getMaxDays(10, 2023));
		assertEquals(29,Ex10.getMaxDays(2, 2024));
		assertEquals(28,Ex10.getMaxDays(2, 2018));
	}
}
