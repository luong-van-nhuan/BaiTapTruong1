package lab2;

import java.util.Random;

public class Ex10 {
	public static boolean isValidDate(int day, int month, int year) {
		if (year < 1) {
			return false;
		}
		if (month < 1 || month > 12) {
			return false;
		}
		int maxDays = getMaxDays(month, year);
		if (day < 1 || day > maxDays) {
			return false;
		}

		return true;
	}

	public static int getMaxDays(int month, int year) {
		int maxDays;

		if (month == 2) {
			if (isLeapYear(year)) {
				maxDays = 29;
			} else {
				maxDays = 28;
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			maxDays = 30;
		} else {
			maxDays = 31;
		}

		return maxDays;
	}

	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

	public static void main(String[] args) {
		Random rd = new Random();
		int day = rd.nextInt(50) + 1;
		int month = rd.nextInt(13) + 1;
		int year = rd.nextInt(10000) + 1;
		if (isValidDate(day, month, year)) {
			System.out.printf("Ngày: %d/%d/%d hợp lệ%n", day, month, year);
			int nextDay = day + 1;
			int nextMonth = month;
			int nextYear = year;

			if (nextDay > getMaxDays(nextMonth, nextYear)) {
				nextDay = 1;
				nextMonth++;

				if (nextMonth > 12) {
					nextMonth = 1;
					nextYear++;
				}
			}

			System.out.println("Ngày hôm sau là: " + nextDay + "/" + nextMonth + "/" + nextYear);
		} else {
			System.out.println("Ngày không hợp lệ");
		}
	}
}
