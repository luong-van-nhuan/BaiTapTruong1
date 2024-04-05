package lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ex6 {
	public static boolean checkForIncrease(int arr[]) {
		if (arr == null || arr.length == 0) {
			return false;

		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				return false;
			}
		}
		return true;
	}

	public static List<Integer> sortUpAscending(int arr[]) {
		if (arr == null || arr.length == 0) {
			return new ArrayList<>();
		}
		List<Integer> numberSeries = new ArrayList<>();
		Arrays.sort(arr);
		for (int number : arr) {
			numberSeries.add(number);
		}
		
		return numberSeries;

	}

	public static void main(String[] args) {
		int size = 7;
		int arr[] = new int[size];
		Random rd = new Random();
		for (int i = 0; i < size; i++) {
			arr[i] = rd.nextInt(21) - 10;
		}
		System.out.println("Mảng ngẫu nhiên");
		for (int number : arr) {
			System.out.print(number + " ,");
		}
		System.out.print("\n");
		System.out.println("Dãy số đó" + (checkForIncrease(arr) ? " có " : " không ") + "tăng dần");
		System.out.println("Dãy số tăng dần: " + sortUpAscending(arr));
	}

}