package Recursion_1;

public class Last_Occur_In_Array {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 6, 5, 7, 4, 20, 22 };
		int n = 4;
		int idx = lastOccurence(arr, n, 0, -1);
		System.out.print(idx);
	}
	
	public static int lastOccurence(int[] arr, int n, int i, int idx) {
		if (i == arr.length) {
			return idx;
		}
		if(arr[i] == n) {
			idx = i;
		}
		return lastOccurence(arr, n, i + 1, idx);
	}
	
}
