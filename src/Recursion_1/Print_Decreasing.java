package Recursion_1;

public class Print_Decreasing {

	public static void main(String[] args) {
		int n = 10;
		print(n);
	}
	
	public static void print(int n) {
		if(n == 0) {
			return;
		}
		System.out.print(n + ", ");
		print(n - 1);
	}

}
