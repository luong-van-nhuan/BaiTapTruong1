package lab4_5;

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
		int[] arr = { 34, 87, 75, 85, 35, 86, 54, 87, 54, 87 };
		System.out.println("Phần tử lớn nhất xuất hiện trong dãy " + countTheLargestElement(arr) + " lần");
	}


}
