package lab3;

import java.util.Random;

public class Ex8 {
	public static int calculateSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static long calculateFactorial(int n) {
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(10) + 1;
		System.out.println("Số tự nhiên n là: " + n);
		System.out.println("Tính tổng S = " + calculateSum(n));
		System.out.println("Tính giai thừa n! = " + calculateFactorial(n));
	}

}
