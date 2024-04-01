package lab2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex9_Test {

	@Test
	void testcConvertToWords() {
		assertEquals("chín trăm bốn mươi sáu",Ex9.convertToWords(946));
		assertEquals("hai trăm bốn mươi ba",Ex9.convertToWords(243));
		assertEquals("bảy trăm lẻ ba",Ex9.convertToWords(703));
	}

}
