package prepfint;

public class MyArray {

	// reverse the string
	public static void reverse(String intro) {
		String[] sparr = intro.split("");

		for (int i = sparr.length - 1; i >= 0; i--) {
			System.out.print(sparr[i]);
		}
	}

	// merge two sorted arrays
	public static void merge_array(int[] arr1, int[] arr2) {
		int length = arr1.length + arr2.length;

		int tot_arr[] = new int[length];

		for (int i = 0; i < arr1.length; i++) {

			tot_arr[i] = arr1[i];

		}
		
		for (int j = 0; j < arr2.length; j++) {

			tot_arr[j + arr1.length] = arr2[j];

		}

		for (int i = 0; i < tot_arr.length; i++) {
			System.out.print(tot_arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		// Reversing String
		String name = "i";
		// reverse(name); //1

		// Merging Two Sorted Arrays
		// Given: [1,2,3,4] [11,12,13,14]
		// To Do: [1,2,3,4,11,12,13,14]
		int[] array_1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] array_2 = { 10, 11, 12, 13, 14, 15, 16, 17, 18 };

		merge_array(array_1, array_2);

	}

}
