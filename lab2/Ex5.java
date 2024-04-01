package lab2;

public class Ex5 {

    public static void main(String[] args) {
        double a1 = Math.random() * 10;
        double b1 = a1 + Math.random() * 10;
        double a2 = Math.random() * 10;
        double b2 = a2 + Math.random() * 10; 

        double[] results = calculateIntersectionAndUnion(a1, b1, a2, b2);
        System.out.println("a1: " + a1 + ", b1: " + b1 + ", a2: " + a2 + ", b2: " + b2);
        System.out.println("Độ dài phần giao: " + results[0]);
        System.out.println("Độ dài phần hợp: " + results[1]);
    }

    public static double[] calculateIntersectionAndUnion(double a1, double b1, double a2, double b2) {
        double[] results = new double[2]; 
        double intersectionStart = Math.max(a1, a2);
        double intersectionEnd = Math.min(b1, b2);

        results[0] = intersectionStart < intersectionEnd ? intersectionEnd - intersectionStart : 0;

        double unionStart = Math.min(a1, a2);
        double unionEnd = Math.max(b1, b2);

        results[1] = unionEnd - unionStart;

        return results;
    }
}
