package lab4;

import java.util.Arrays;

public class Ex7 {
	public static boolean symmetry(int arr[]) {
		if (arr.length <= 2) {
			return false;
		}
		for (int i = 0; i < arr.length / 2; i++) {
			if(arr[i] != arr[arr.length - i -1]) {
				return false;
			}
		}
		return true;

	}
	public static boolean hasSignChange(int arr []) {
		if(arr.length < 2) {
			return false;
		}
		for(int i = 0; i < arr.length -1; i++) {
			if(arr[i] * arr[i + 1] >= 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int arr [] = {6,4,7,9,3,9,7,4,6};
		int array [] = {4,-3,8,-1,7,-9};
		System.out.println("Dãy số: " + Arrays.toString(arr));
		System.out.println("Dãy số đó " + (symmetry(arr) ? "có " : "không ") + "đối xứng");

		System.out.println("Dãy số: " + Arrays.toString(array));
		System.out.println("Dãy số: " + (hasSignChange(array) ? "có " : "không ") + "đan dấu");
		
	}
}
