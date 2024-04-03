package lab4_5;

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
			if(arr[i] == x) {
				count ++;
			}
		}
		return count;
	}
	public static int locationAppears(int arr[], int x) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int location = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == x) {
				location = i + 1;
			}
		}
		return location ;
	}
	
	public static void main(String[] args) {
		int x = 7;
		int size = 20;
		int arr[] = new int[size];
		Random rd = new Random();
		for (int i = 1; i < size; i++) {
			arr[i] = rd.nextInt(101) - 50;
		}
		System.out.println("Mảng ngẫu nhiên");
		for (int number : arr) {
			System.out.print(number + ", ");
		}
		System.out.print("\n");
		System.out.println("số x " + (thatNumberAppears(arr, x) ? "có" : "không") + " xuất hiện trong dãy");
		System.out.println("Số x xuất hiện " + theNumberOfOccurrences(arr, x) + " lần trong dãy");
		System.out.println("Số x xuất hiện tại vị trí thứ " + locationAppears(arr, x));
	}

}
