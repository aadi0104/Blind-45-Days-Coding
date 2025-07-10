package Arrays_1;

// 42. Trapping Rain Water
public class Rain_Water_Trapping {

	class Solution {

		public int trap(int[] height) {
			int n = height.length;
			int[] left = new int[n];
			int[] right = new int[n];
			int max1 = height[0];
			int max2 = height[n - 1];
			left[0] = max1;
			right[n - 1] = max2;
			for (int i = 1; i < n; i++) {
				if (height[i] > max1) {
					max1 = height[i];
				}
				left[i] = max1;
			}
			for (int i = n - 2; i >= 0; i--) {
				if (height[i] > max2) {
					max2 = height[i];
				}
				right[i] = max2;
			}
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += Math.min(left[i], right[i]) - height[i];
			}
			return sum;
		}

	}
	R
}
