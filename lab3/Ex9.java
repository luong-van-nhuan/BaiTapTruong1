package lab3;

import java.util.Scanner;

public class Ex9 {

	public static double calculateFutureValue(double p, double r, int n) {
		return p * Math.pow(1 + r, n);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số tiền gởi ngân hàng");
		double p = sc.nextDouble();
		System.out.println("Nhập lãi suất tiền gởi từng tháng");
		double r = sc.nextDouble();
		System.out.println("Nhập số tháng gởi");
		int n = sc.nextInt();
		double F = calculateFutureValue(p, r, n);
		System.out.println("Tổng tiến rút ra sau " + n + " tháng là: " + calculateFutureValue(p, r, n));
		sc.close();
	}
}