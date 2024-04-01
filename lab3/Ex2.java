package lab3;

import java.util.Random;

public class Ex2 {
	public static int countNumbers(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10;
		}
		return count;
	}

	public static int reverseNumbers(int n) {
		int reverse = 0;
		while (n > 0) {
			reverse = reverse * 10 + n % 10;
			n /= 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(100) + 10;
		System.out.println("Số nguyên n: " + n);
		System.out.println("Số chữ số của số nguyên " + n + " là " + countNumbers(n));
		System.out.println("Số đảo ngược của số " + n + " là " + reverseNumbers(n));
	}
}
