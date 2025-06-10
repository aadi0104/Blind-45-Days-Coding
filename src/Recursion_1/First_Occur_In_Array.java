package Recursion_1;

public class First_Occur_In_Array {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 6, 5, 7, 4, 20, 22 };
		int n = 4;
		int idx = firstOccurence(arr, n, 0);
		System.out.print(idx);
	}

	public static int firstOccurence(int[] arr, int n, int i) {
		if (i == arr.length) {
			return -1;
		}
		if (arr[i] == n) {
			return i;
		}
		return firstOccurence(arr, n, i + 1);
	}
	
}
