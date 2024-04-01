package lab2;

public class Ex1 {
	public static double findMax(double a, double b) {
		return Math.max(a, b);
	}

	public static void main(String[] args) {
		double a = Math.random() * 200 - 100;
		double b = Math.random() * 200 - 100;
		double max = findMax(a, b);
		System.out.println("Số thực a: " + a);
		System.out.println("Số thực b: " + b);
		System.out.println("Số lớn nhất giữa a và b: " + max);
	}
}
