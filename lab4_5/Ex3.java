package lab4_5;

import java.util.Random;

import javax.sound.midi.Soundbank;

public class Ex3 {
	public static int countNegativeNumbers(int arr[]) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				count++;
			}
		}
		return count;

	}

	public static int countPositiveNumbers(int arr[]) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				count++;
			}
		}
		return count;

	}

	public static int countZero(int arr[]) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		return count;

	}

	public static int largestNegativeNumber(int arr[]) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int max = -99999;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < 0) {
				if (max < arr[i]) {
					max = arr[i];
				}
			}
		}
		return max;
	}

	public static int largestPositiveNumber(int arr[]) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int min = 99999;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > 0) {
				if (min > arr[i]) {
					min = arr[i];
				}
			}
		}
		return min;
	}

	public static boolean theNegativeSumIsEqualToThePositiveSum(int arr[]) {
		if (arr == null || arr.length == 0) {
			return false;
		}
		int negativeTotal = 0;
		int positiveTotal = 0;
		for (int number : arr) {
			if (number < 0) {
				negativeTotal += number;
			} else {
				positiveTotal += number;
			}
		}
		return Math.abs(negativeTotal) == positiveTotal;
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
		System.out.println("Có " + countNegativeNumbers(arr) + " số âm");
		System.out.println("Có " + countPositiveNumbers(arr) + " số dương");
		System.out.println("Có " + countZero(arr) + " số không");
		System.out.println("Số âm lớn nhất là: " + largestNegativeNumber(arr));
		System.out.println("Số dương nhỏ nhất là: " + largestPositiveNumber(arr));
		System.out.println("|Tổng âm|" + (theNegativeSumIsEqualToThePositiveSum(arr) ? "Có bằng" : "Không bằng") + " tổng dương");
	}

}
