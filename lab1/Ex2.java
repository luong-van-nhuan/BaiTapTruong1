package lab1;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập số nguyên x: ");
		int x = input.nextInt();
		System.out.println("y = " + (4 * (x - 3) + 20));
	}
}
