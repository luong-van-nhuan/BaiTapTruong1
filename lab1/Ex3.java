package lab1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số mile: ");
        double x = input.nextInt();
        System.out.println(x + " miles = " + (x * 1.609) + " km ");
    }
}
