package lab2;

public class Ex6 {
    public static boolean isTriangleValid(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double calculateArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static double calculateAngleA(double a, double b, double c) {
        return Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c)));
    }

    public static double calculateAngleB(double a, double b, double c) {
        return Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c)));
    }

    public static double calculateAngleC(double a, double b, double c) {
        return Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));
    }

    public static void main(String[] args) {
        double a = Math.random() * 100;
        double b = Math.random() * 100;
        double c = Math.random() * 100;
        if (isTriangleValid(a, b, c)) {
            double perimeter = calculatePerimeter(a, b, c);
            System.out.println("Chu vi tam giác: " + perimeter);
            double area = calculateArea(a, b, c);
            System.out.println("Diện tích tam giác: " + area);
            double angleA = calculateAngleA(a, b, c);
            System.out.println("Góc A: " + angleA + " độ");
            double angleB = calculateAngleB(a, b, c);
            System.out.println("Góc B: " + angleB + " độ");
            double angleC = calculateAngleC(a, b, c);
            System.out.println("Góc C: " + angleC + " độ");
        } else {
            System.out.println("Ba cạnh a, b, c không tạo thành tam giác hợp lệ.");
        }
    }
}
