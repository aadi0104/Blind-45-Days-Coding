package Recursion_And_Backtracking_1;

import java.util.*;

// 39. Combination Sum
public class Combination_Sum {

	class Solution {

		public List<List<Integer>> combinationSum(int[] candidates, int target) {
			List<Integer> temp = new ArrayList<>();
			List<List<Integer>> ans = new ArrayList<>();
			combinations(candidates, target, temp, ans, 0);
			return ans;
		}

		public static void combinations(int[] candidates, int target, List<Integer> temp, List<List<Integer>> ans,
				int idx) {
			if (target < 0 || idx == candidates.length) {
				return;
			}
			if (target == 0) {
				ans.add(new ArrayList<>(temp));
				return;
			}
			temp.add(candidates[idx]);
			combinations(candidates, target - candidates[idx], temp, ans, idx);
			temp.remove(temp.size() - 1);
			combinations(candidates, target, temp, ans, idx + 1);
		}

	}
	
}
