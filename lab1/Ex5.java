package lab1;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập tổng số giây: ");
		int seconds = input.nextInt();

		int hours = seconds / 3600;
		int minutes = (seconds % 3600) / 60;
		seconds = seconds % 60;

		System.out.printf("%d:%d:%d\n", hours, minutes, seconds);
	}
}