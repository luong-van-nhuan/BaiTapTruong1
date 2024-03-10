package lab1;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		double y;
		Scanner input = new Scanner(System.in);
		System.out.println("Please input one integer and one floating-point number: ");
		System.out.println("Nhập số nguyên x: ");
		int x = input.nextInt();

		System.out.println("Nhập số thập phân y: ");
		y = input.nextDouble();

		System.out.println("Input values are " + x + " and " + y + " their product is " + (x * y));
	}
}