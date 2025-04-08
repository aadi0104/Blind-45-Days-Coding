package Binary_Tree_3;

import java.util.*;

// 113. Path Sum II
public class Path_Sum_II {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {

		public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
			List<Integer> temp = new ArrayList<>();
			List<List<Integer>> ans = new ArrayList<>();
			Path(root, targetSum, temp, ans);
			return ans;
		}

		public void Path(TreeNode node, int targetSum, List<Integer> temp, List<List<Integer>> ans) {
			if (node == null) {
				return;
			}
			if (node.left == null && node.right == null) {
				if (node.val == targetSum) {
					temp.add(node.val);
					ans.add(new ArrayList<>(temp));
					temp.remove(temp.size() - 1);
				}
				return;
			}
			temp.add(node.val);
			Path(node.left, targetSum - node.val, temp, ans);
			Path(node.right, targetSum - node.val, temp, ans);
			temp.remove(temp.size() - 1);
		}

	}

}
