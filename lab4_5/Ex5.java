package lab4_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ex5 {
	public static boolean thatNumberAppears(int arr[], int x) {
		if (arr == null || arr.length == 0) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return true;
			}
		}
		return false;
	}

	public static int theNumberOfOccurrences(int arr[], int x) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				count++;
			}
		}
		return count;
	}

	public static List<Integer> locationAppears(int arr[], int x) {
		if (arr == null || arr.length == 0) {
			return new ArrayList<>();
		}
		List<Integer> locations = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				locations.add(i + 1);
			}
		}
		return locations;

	}

	public static List<Integer> deleteAllXElements(int arr[], int x) {
		if (arr == null || arr.length == 0) {
			return new ArrayList<>();
		}
		List<Integer> arrays = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != x) {
				arrays.add(arr[i]);
			}
		}
		return arrays;
	}

	public static void main(String[] args) {
		int x = 7;
		int size = 20;
		int arr[] = new int[size];
		Random rd = new Random();
		for (int i = 0; i < size; i++) {
			arr[i] = rd.nextInt(21) - 10;
		}
		System.out.println("Mảng ngẫu nhiên");
		for (int number : arr) {
			System.out.print(number + ", ");
		}

		System.out.print("\n");
		System.out.println("số " + x + (thatNumberAppears(arr, x) ? " có" : " không") + " xuất hiện trong dãy");
		System.out.println("Số " + x + " xuất hiện " + theNumberOfOccurrences(arr, x) + " lần trong dãy");
		System.out.println("Số " + x + " xuất hiện tại vị trí thứ " + locationAppears(arr, x));
		System.out.println("Mảng ban đầu: " + Arrays.toString(arr));
		System.out.println("Mảng không có các phần tử " + x + " : " + deleteAllXElements(arr, x));
	}
}
