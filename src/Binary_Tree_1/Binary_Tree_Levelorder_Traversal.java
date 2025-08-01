package Binary_Tree_1;

import java.util.*;

//102. Binary Tree Level Order Traversal
public class Binary_Tree_Levelorder_Traversal {

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

		public List<List<Integer>> levelOrder(TreeNode root) {
			List<List<Integer>> ans = new ArrayList<>();
			if (root == null) {
				return ans;
			}
			Queue<TreeNode> q = new LinkedList<>();
			q.add(root);
			while (!q.isEmpty()) {
				List<Integer> temp = new ArrayList<>();
				int size = q.size();
				for (int i = 0; i < size; i++) {
					TreeNode curr = q.poll();
					temp.add(curr.val);
					if (curr.left != null) {
						q.add(curr.left);
					}
					if (curr.right != null) {
						q.add(curr.right);
					}
				}
				ans.add(temp);
			}
			return ans;
		}

	}
	
}
