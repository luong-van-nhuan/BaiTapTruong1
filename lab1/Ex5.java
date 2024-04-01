package lab1;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập tổng số giây: ");
		int tongSoGiay = input.nextInt();

		int gio = tongSoGiay / 3600;
		int phut = (tongSoGiay % 3600) / 60;
		int giay = (tongSoGiay % 3600) % 60;

		System.out.println(gio + ":" + phut + ":" + giay);
	}
}
