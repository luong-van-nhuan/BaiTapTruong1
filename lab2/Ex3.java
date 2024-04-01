package lab2;

public class Ex3 {
	public static void main(String[] args) {
		double a = Math.random() * 200 - 100;
		double b = Math.random() * 200 - 100;
		System.out.println("Hệ số a = " + a);
		System.out.println("Hệ số b = " + b);
		if (b > 0) {
			System.out.println("Phương trình bạn vừa nhập có dạng: " + a + "x + " + b + " = 0");
		} else {
			System.out.println("Phương trình bạn vừa nhập có dạng: " + a + "x " + b + " = 0");
		}
		System.out.println(solveLinearEquation(a, b));
	}

	public static String solveLinearEquation(double a, double b) {
		if (a == 0) {
			if (b == 0) {
				return "Phương trình vô số nghiệm";
			} else {
				return "Phương trình vô nghiệm";
			}
		} else {
			if(b==0) {
				return "Phương trình có nghiệm x = 0.0";
			}else {
			double x = -b / a;
			return "Phương trình có nghiệm x = " + (x == -0.0 ? 0.0 : x);
		}
	}
	}
}
