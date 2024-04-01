package lab2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex8_Test {

	@Test
	void test() {
		assertEquals("Giáp Thìn",Ex8.convertToLunarYear(2024));
		assertEquals("Ất Dậu",Ex8.convertToLunarYear(2005));
		assertEquals("Giáp Tuất",Ex8.convertToLunarYear(2534));
	}

}
