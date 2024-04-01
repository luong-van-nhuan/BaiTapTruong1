package lab2;

public class Ex7 {
    public static boolean isTriangleValid(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static String determineTriangleType(double a, double b, double c) {
        if (!isTriangleValid(a, b, c)) {
            return "Không phải là tam giác";
        }
        if (a == b && b == c) {
            return "Tam giác đều";
        }
        boolean isRight = isRightAngle(a, b, c) || isRightAngle(b, c, a) || isRightAngle(c, a, b);
        if (a == b || a == c || b == c) {
            return isRight ? "Tam giác vuông cân" : "Tam giác cân";
        }
        return isRight ? "Tam giác vuông" : "Tam giác thường";
    }

    public static boolean isRightAngle(double a, double b, double c) {
        return Math.abs((a * a + b * b) - (c * c)) < 1E-9 ||
               Math.abs((a * a + c * c) - (b * b)) < 1E-9 ||
               Math.abs((b * b + c * c) - (a * a)) < 1E-9;
    }

    public static void main(String[] args) {
        double a = Math.random() * 100;
        double b = Math.random() * 100;
        double c = Math.random() * 100;
        System.out.println("Các cạnh a, b, c có thể tạo thành tam giác không? " + isTriangleValid(a, b, c));
        System.out.println("Các cạnh a, b, c tạo thành một " + determineTriangleType(a, b, c));
    }
}
