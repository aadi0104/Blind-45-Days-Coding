package Recursion_3;

//import java.util.*;

public class Tower_Of_Hanoi {

	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
		int n = 3;
		int ans = TOH(n, "T1", "T2", "T3");
		System.out.println(ans);
	}

	public static int TOH(int n, String src, String dest, String helper) {
		if (n == 1) {
			System.out.println("Move 1th disc from " + src + " to " + dest);
			return 1;
		}
		int f = TOH(n - 1, src, helper, dest);
		System.out.println("Move " + n + "th disc from " + src + " to " + dest);
		int s = TOH(n - 1, helper, dest, src);
		return f + s + 1;
	}

}
