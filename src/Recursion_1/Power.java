package Recursion_1;

public class Power {

	public static void main(String[] args) {
		int num = 5;
		int power = 2;
		int ans = pow(num, power);
		System.out.print(ans);
	}
	
	public static int pow(int num, int power) {
		if(power == 1) {
			return num;
		}
		return num * pow(num, power - 1);
	}
	
}
