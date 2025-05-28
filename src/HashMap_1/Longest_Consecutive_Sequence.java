package HashMap_1;

import java.util.*;

// 128. Longest Consecutive Sequence
public class Longest_Consecutive_Sequence {

	class Solution {
	
		public int longestConsecutive(int[] nums) {
			HashSet<Integer> set = new HashSet<>();
			for (int i = 0; i < nums.length; i++) {
				set.add(nums[i]);
			}
			int ans = 0;
			for (int i = 0; i < nums.length; i++) {
				if (set.contains(nums[i]) && !set.contains(nums[i] - 1)) {
					int v = nums[i];
					int count = 0;
					while (set.contains(v)) {
						set.remove(v);
						v++;
						count++;
					}
					ans = Math.max(ans, count);
				}
			}
			return ans;
		}
	
	}
	
}
