package lab4;

import java.util.Arrays;
import java.util.Random;

public class Ex4 {
	public static int[] reverseOrder(int arr[]) {
		if (arr == null || arr.length == 0) {
			return new int[0];
		}
		int n = arr.length;
		int[] reversed = new int[n];
		for (int i = 0; i < n; i++) {
			reversed[i] = arr[n - 1 - i];
		}
		return reversed;
	}

	public static void main(String[] args) {
		int arr[] = new int[10];
		Random rd = new Random();
		for (int i = 0; i < 10; i++) { 
			arr[i] = rd.nextInt(21) - 10;
		}
		System.out.println("Mảng ngẫu nhiên");
		System.out.println(Arrays.toString(arr));
		System.out.println("Đảo ngược thứ tự của mảng: " + Arrays.toString(reverseOrder(arr)));
	}
}
