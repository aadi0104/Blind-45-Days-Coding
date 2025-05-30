package Recursion_And_Backtracking_2;

import java.util.*;

// 78. Subsets
public class Subsets_1 {

	class Solution {
	
		public List<List<Integer>> subsets(int[] nums) {
			List<List<Integer>> ans = new ArrayList<>();
			backtrack(nums, new ArrayList<>(), ans, 0);
			return ans;
		}
	
		public void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> ans, int idx) {
			ans.add(new ArrayList<>(temp));
			for (int i = idx; i < nums.length; i++) {
				temp.add(nums[i]);
				backtrack(nums, temp, ans, i + 1);
				temp.remove(temp.size() - 1);
			}
		}
	
	}

}
