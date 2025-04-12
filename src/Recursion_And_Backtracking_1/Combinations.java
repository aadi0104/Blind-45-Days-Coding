package Recursion_And_Backtracking_1;

import java.util.*;

public class Combinations {

	class Solution {

		public List<List<Integer>> combine(int n, int k) {
			List<Integer> temp = new ArrayList<>();
			List<List<Integer>> ans = new ArrayList<>();
				combination(n, k, temp, ans, 1);
			return ans;
		}

		public void combination(int n, int k, List<Integer> temp, List<List<Integer>> ans, int st) {
			if (temp.size() == k) {
				ans.add(new ArrayList<>(temp));
				return;
			}
			for(int i = st; i <= n; i++) {
				temp.add(i);
				combination(n, k, temp, ans, i + 1);
				temp.remove(temp.size() - 1);				
			}
		}
	}
}
