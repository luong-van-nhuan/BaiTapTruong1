package lab4_5;

public class Ex3 {
	public static int countNegativeNumbers(int arr []) {
		if(arr == null || arr.length == 0) {
			return 0;
		}
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				count ++;
			}
		}
		return count;
		
	}
	public static int countPositiveNumbers(int arr []) {
		if(arr == null || arr.length == 0) {
			return 0;
		}
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				count ++;
			}
		}
		return count;
		
	}
	public static int countZero(int arr []) {
		if(arr == null || arr.length == 0) {
			return 0;
		}
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				count ++;
			}
		}
		return count;
		
	}
	public static int largestNegativeNumber(int arr []) {
		if(arr == null || arr.length == 0) {
			return 0;
		}
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < 0) {
				if(max < arr[i]) {
					max = arr[i];
				}
			}
		}
		return max;
	}
	public static int largestPositiveNumber(int arr []) {
		if(arr == null || arr.length == 0) {
			return 0;
		}
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > 0) {
				if(min > arr[i]) {
					min = arr[i];
				}
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int arr [] = {-4,7,9,4,-6,0,3,7,-5,6,0,-1};
		System.out.println("Có " + countNegativeNumbers(arr) + " số âm");
		System.out.println("Có " + countPositiveNumbers(arr) + " số dương");
		System.out.println("Có " + countZero(arr) + " số không");
		System.out.println("Số âm lớn nhất là: " + largestNegativeNumber(arr));
		System.out.println("Số dương nhỏ nhất là: " + largestPositiveNumber(arr));
	}

}
