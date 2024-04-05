package lab4;

import java.util.Random;

public class Ex2 {
	public static int countTheLargestElement (int arr[]) {
		if (arr == null || arr.length == 0) {
			return -1;
		}
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int size = 20;
		int arr[] = new int[size];
		Random rd = new Random();
		for (int i = 0; i < size; i++) {
			arr[i] = rd.nextInt(21) - 5;
		}
		System.out.println("Mảng ngẫu nhiên");
		for (int number : arr) {
			System.out.print(number + " ,");
		}
		System.out.print("\n");
		System.out.println("Phần tử lớn nhất xuất hiện trong dãy " + countTheLargestElement(arr) + " lần");
	}


}
