package Recursion_And_Backtracking_2;

import java.util.*;

// 47. Permutations II
public class Permutations_II {

	class Solution {

		public List<List<Integer>> permuteUnique(int[] nums) {
			List<List<Integer>> ans = new ArrayList<>();
			Arrays.sort(nums);
			permutation(nums, new ArrayList<>(), ans, new boolean[nums.length]);
			return ans;
		}
	
		public static void permutation(int[] nums, List<Integer> temp, List<List<Integer>> ans, boolean[] visited) {
			if (temp.size() == nums.length) {
				ans.add(new ArrayList<>(temp));
				return;
			}
			for (int i = 0; i < nums.length; i++) {
				if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
					continue;
				}
				if (!visited[i]) {
					visited[i] = true;
					temp.add(nums[i]);
					permutation(nums, temp, ans, visited);
					temp.remove(temp.size() - 1);
					visited[i] = false;
				}
			}
		}

	}

}
