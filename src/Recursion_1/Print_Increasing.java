package Recursion_1;

public class Print_Increasing {

	public static void main(String[] args) {
		int n = 10;
		print(n);
	}
	
	public static void print(int n) {
		if(n == 0) {
			return;
		}
		print(n - 1);
		System.out.print(n + ", ");
	}
	
}
