package Recursion_And_Backtracking_2;

import java.util.*;

// 46. Permutations
public class Permutations {

	class Solution {

		public List<List<Integer>> permute(int[] nums) {
			List<List<Integer>> ans = new ArrayList<>();
			permutation(nums, new ArrayList<>(), ans);
			return ans;
		}
	
		public static void permutation(int[] nums, List<Integer> temp, List<List<Integer>> ans) {
			if(temp.size() == nums.length) {
				ans.add(new ArrayList<>(temp));
				return;
			}
			for (int i = 0; i < nums.length; i++) {
				if (!temp.contains(nums[i])) {
					temp.add(nums[i]);
					permutation(nums, temp, ans);
					temp.remove(temp.size() - 1);
				}
			}
		}

	}

}
