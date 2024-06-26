package lab4;

import java.util.Random;

public class Ex1 {
	public static int largestElementPosition(int arr[]) {
		if (arr == null || arr.length == 0) {
			return -1;
		}
		int max = arr[0];
		int indexMax = 0;
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				indexMax = i;
			}
		}
		return indexMax + 1;
	}

	public static int largestElementValue(int arr[]) {
		if (arr == null || arr.length == 0) {
			return -1;
		}
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

		}
		return max;
	}

	public static int smallestElementPosition(int arr[]) {
		if (arr == null || arr.length == 0) {
			return -1;
		}
		int min = arr[0];
		int indexMin = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				indexMin = i;
			}
		}
		return indexMin + 1;
	}

	public static int smallestElementValue(int arr[]) {
		if (arr == null || arr.length == 0) {
			return -1;
		}
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

		}
		return min;
	}

	public static int sumOfElements(int arr[]) {
		if (arr == null || arr.length == 0) {
			return -1;
		}
		int sum = arr [0];
		for (int i = 1; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int size = 20;
		int arr[] = new int[size];
		Random rd = new Random();
		for (int i = 0; i < size; i++) {
			arr[i] = rd.nextInt(101) - 50;
		}
		System.out.println("Mảng ngẫu nhiên");
		for (int number : arr) {
			System.out.print(number + " ,");
		}
		System.out.print("\n");
		System.out.println("Vị trí phần tử lớn nhất của dãy là: " + largestElementPosition(arr));
		System.out.println("Giá trị phần tử lớn nhất của dãy là: " + largestElementValue(arr));
		System.out.println("Vị trí phần tử lớn nhỏ của dãy là: " + smallestElementPosition(arr));
		System.out.println("Giá trị phần tử lớn nhỏ của dãy là: " + smallestElementValue(arr));
		System.out.println("Tổng các phần tử của dãy là: " + sumOfElements(arr));
	}

}
