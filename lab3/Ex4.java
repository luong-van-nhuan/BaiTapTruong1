package lab3;

import java.util.Random;

public class Ex4 {
	public static int greatestCommonDivisor(int a, int b) {
		while (b != 0) {
			int x = b;
			b = a % b;
			a = x;
		}
		return a;
	}
	public static long leastCommonMultiple(int a, int b) {
		return (long) a * b / greatestCommonDivisor(a, b);
	}
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(101);
		int b = rd.nextInt(101);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("Ước số chung lớn nhất là: " + greatestCommonDivisor(a, b));
		System.out.println("Bội số chung nhỏ nhất là: " + leastCommonMultiple(a, b));
	}
}
