package Recursion_2;

public class Coin_Toss {

	public static void main(String[] args) {
		int n = 4;
		int ans = toss(n, "");
		System.out.print(ans);
	}

	public static int toss(int n, String ways) {
		if (n == 0) {
			System.out.println(ways);
			return 1;
		}
		int head = toss(n - 1, ways + "H");
		int tail = toss(n - 1, ways + "T");
		return head + tail;
	}

}
