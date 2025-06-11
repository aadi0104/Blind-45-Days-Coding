package Recursion_2;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 5;
		int ans = fibo(n);
		System.out.print(ans);
	}

	public static int fibo(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return fibo(n - 1) + fibo(n - 2);
	}
	
}
