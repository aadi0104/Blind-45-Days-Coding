package Recursion_And_Backtracking_3;

// 357. Count Numbers with Unique Digits
public class Unique_Digits {

	class Solution {
		public int countNumbersWithUniqueDigits(int n) {
			return count(n, 0, new boolean[10]);
		}

		public int count(int n, int num, boolean[] marker) {
			if (n == -1) {
				return 0;
			}
			int i = 0;
			if (num == 0) {
				i = 1;
			}
			int ans = 1;
			for (; i <= 9; i++) {
				if (marker[i]) {
					continue;
				}
				marker[i] = true;
				ans += count(n - 1, num * 10 + i, marker);
				marker[i] = false;
			}
			return ans;
		}
	}

}
