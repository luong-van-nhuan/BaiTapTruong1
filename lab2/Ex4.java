package lab2;

public class Ex4 {
	public static String solveQuadraticEquation(double a, double b, double c) {
		if (a == 0) {
			return "Lỗi! phương trình bậc 2 a > 0";
		}

		double delta = b * b - 4 * a * c;
		double x1, x2;

		if (delta > 0) {
			x1 = (-b - Math.sqrt(delta) / (2 * a));
			x2 = (-b + Math.sqrt(delta) / (2 * a));
			return "Phương trình có 2 nghiệm phân biệt x1 = " + x1 + ", x2 = " + x2;
		} else if (delta == 0) {
			x1 = -b / (2 * a);
			return "Phương trình có nghiệm kép x1 = x2 = " + x1;
		} else {
			return "Phương trình vô nghiệm";
		}
	}

	public static void main(String[] args) {
		double a = Math.random() * 200 - 100;
		double b = Math.random() * 200 - 100;
		double c = Math.random() * 200 - 100;
		System.out.println(solveQuadraticEquation(a, b, c));
	}
}
