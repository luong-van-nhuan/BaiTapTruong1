
public class Ex6 {
	public static boolean isTriangleValid(double a, double b, double c) {
		return ((a + b) > c && (a + c) > b && (b + c) > a);
	}

	public static double calculatePerimeter(double a, double b, double c) {
		return a + b + c;
	}

	public static double calculateArea(double a, double b, double c) {
		double s = a + b + c;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	public static double calculateAngleA(double a, double b, double c) {
		return Math.cos((b * b + c * c - a * a) / (2 * b * c));
	}

	public static double calculateAngleB(double a, double b, double c) {
		return Math.cos((a * a + c * c - b * b) / (2 * a * c));
	}

	public static double calculateAngleC(double a, double b, double c) {
		return Math.cos((a * a + b * b - c * c) / (2 * b * a));
	}
	public static void main(String[] args) {
		double a = 3;
		double b = 4;
		double c = 5;
		if(isTriangleValid(a, b, c)) {
			double perimeter = calculatePerimeter(a, b, c);
			System.out.println("Chu vi tam giác: " + perimeter);
			double area = calculateArea(a, b, c);
			System.out.println("Diện tích tam giác: " + area);
			double angleA = calculateAngleA(a, b, c);
			System.out.println("Góc A: " + Math.toDegrees(angleA) + " Độ");
			double angleB = calculateAngleB(a, b, c);
			System.out.println("Góc B: " + Math.toDegrees(angleB) + " Độ");
			double angleC = calculateAngleC(a, b, c);
			System.out.println("Góc C: " + Math.toDegrees(angleC) + " Độ");
		}else {
			System.out.println("Ba cạnh a,b,c không tạo thành tam giác hợp lệ.");
		}
	}
}
