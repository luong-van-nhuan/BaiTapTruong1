package lab2;

import javax.swing.event.SwingPropertyChangeSupport;

public class Ex2 {
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

	public static int getDaysInMonth(int month, int year) {
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			return 31;
		case 4, 6, 9, 11:
			return 30;
		case 2:
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}
		default:
			return 0;
		}

	}

	public static void main(String[] args) {
		int year = 2024;
		boolean isLeap = isLeapYear(year);
		if (isLeap) {
			System.out.println(year + " Là năm nhuận");
		} else {
			System.out.println(year + " Không phải là năm nhuận");
		}
		int month = 3;
		int days = getDaysInMonth(month, year);
		System.out.println("Có " + days + " trong tháng " + month + " của năm " + year);
	}
}
