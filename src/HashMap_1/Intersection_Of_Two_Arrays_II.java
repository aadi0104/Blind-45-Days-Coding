package HashMap_1;

import java.util.*;

// 350. Intersection of Two Arrays II
public class Intersection_Of_Two_Arrays_II {

	class Solution {

		public int[] intersect(int[] nums1, int[] nums2) {
			List<Integer> ll = new ArrayList<>();
			HashMap<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < nums1.length; i++) {
				if (map.containsKey(nums1[i])) {
					map.put(nums1[i], map.get(nums1[i]) + 1);
				} else {
					map.put(nums1[i], 1);
				}
			}
			for (int i = 0; i < nums2.length; i++) {
				if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
					ll.add(nums2[i]);
					map.put(nums2[i], map.get(nums2[i]) - 1);
				}
			}
			int[] ans = new int[ll.size()];
			for (int i = 0; i < ll.size(); i++) {
				ans[i] = ll.get(i);
			}
			return ans;
		}

	}
	
}
