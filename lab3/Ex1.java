package lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
	public static double calculateSum(ArrayList<Integer> list) {
		double sum = 0;
		for (int n : list) {
			sum += n;
		}
		return sum;
	}

	public static double calculateAverage(ArrayList<Integer> list) {
		double sum = calculateSum(list);
		double average = sum / list.size();
		return average;
	}

	public static int findMax(ArrayList<Integer> list) {
		int max = Integer.MIN_VALUE;
		for (int n : list)
			if (n > max) {
				max = n;
			}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int n = 0;
		do {
			System.out.println("Nhập số nguyên n(dừng lại khi nhập giá trị 0): ");
			n = sc.nextInt();
			sc.nextLine();
			list.add(n);
		} while (n != 0);
		if(!list.isEmpty()) {
			System.out.println("Tổng: " + calculateSum(list));
			System.out.println("Trung bình cộng: " + calculateAverage(list));
			System.out.println("Giá trị lớn nhất: " + findMax(list));
		}else {
			System.out.println("Danh sách rỗng");
		}
	}
}