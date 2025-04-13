package Recursion_And_Backtracking_2;

import java.util.*;

// 90. Subsets II
public class Subsets_II {

	class Solution {

		public List<List<Integer>> subsetsWithDup(int[] nums) {
			List<List<Integer>> ans = new ArrayList<>();
			Arrays.sort(nums);
			backtrack(nums, new ArrayList<>(), ans, 0);
			return ans;
		}

		public void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> ans, int idx) {
			ans.add(new ArrayList<>(temp));
			for (int i = idx; i < nums.length; i++) {
				if (i > idx && nums[i] == nums[i - 1]) {
					continue;
				}
				temp.add(nums[i]);
				backtrack(nums, temp, ans, i + 1);
				temp.remove(temp.size() - 1);
			}
		}

	}

}
