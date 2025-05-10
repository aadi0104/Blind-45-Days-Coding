package Recursion_And_Backtracking_1;

import java.util.*;

// 216. Combination Sum III
public class Combination_Sum_III {

	class Solution {

		public List<List<Integer>> combinationSum3(int k, int n) {
			List<List<Integer>> ans = new ArrayList<>();
			combination(k, n, new ArrayList<>(), ans, 1);
			return ans;
		}

		public void combination(int k, int n, List<Integer> temp, List<List<Integer>> ans, int idx) {
			if (k == 0 && n == 0) {
				ans.add(new ArrayList<>(temp));
				return;
			}
			for (int i = idx; i <= 9; i++) {
				if (k == 0) {
					break;
				}
				if (i > n) {
					break;
				}
				temp.add(i);
				combination(k - 1, n - i, temp, ans, i + 1);
				temp.remove(temp.size() - 1);
			}
		}

	}
	
}
