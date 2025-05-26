package Recursion_And_Backtracking_1;

import java.util.*;

// 40. Combination Sum II
public class Combination_Sum_II {

	class Solution {
		public List<List<Integer>> combinationSum2(int[] candidates, int target) {
			Arrays.sort(candidates);
			List<List<Integer>> ans = new ArrayList<>();
			combinations(candidates, target, new ArrayList<>(), ans, 0);
			return ans;
		}

		public static void combinations(int[] candidates, int target, List<Integer> temp, List<List<Integer>> ans,
				int idx) {
			if (target == 0) {
				ans.add(new ArrayList<>(temp));
				return;
			}
			for (int i = idx; i < candidates.length; i++) {
				if (i > idx && candidates[i] == candidates[i - 1]) {
					continue;
				}
				if (candidates[i] > target) {
					break;
				}
				temp.add(candidates[i]);
				combinations(candidates, target - candidates[i], temp, ans, i + 1);
				temp.remove(temp.size() - 1);
			}
		}
	}
	
}
