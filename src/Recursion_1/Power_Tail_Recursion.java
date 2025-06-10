package Recursion_1;

public class Power_Tail_Recursion {

	public static void main(String[] args) {
		int num = 5;
		int power = 2;
		int ans = pow(num, power, 1);
		System.out.print(ans);
	}

	public static int pow(int num, int power, int acc) {
		if (power == 0) {
			return acc;
		}
		return pow(num, power - 1, acc * num);
	}

}
