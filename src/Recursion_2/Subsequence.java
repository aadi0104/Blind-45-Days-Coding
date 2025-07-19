package Recursion_2;

public class Subsequence {

	public static void main(String[] args) {
		String s = "hello";
		int ans = subseq(s, "");
		System.out.print(ans);
	}

	public static int subseq(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return 1;
		}
		char ch = ques.charAt(0);
		int exc = subseq(ques.substring(1), ans);
		int inc = subseq(ques.substring(1), ans + ch);
		return exc + inc;
	}

}
