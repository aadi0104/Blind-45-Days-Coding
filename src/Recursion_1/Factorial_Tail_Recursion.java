package Recursion_1;

public class Factorial_Tail_Recursion {

	public static void main(String[] args) {
		int n = 4;
		int ans = fact(n, 1);
		System.out.print(ans);
	}
	
	public static int fact(int n, int acc) {
		if(n == 0 || n == 1) {
			return acc;
		}
		return fact(n - 1, acc * n);
	}

}
