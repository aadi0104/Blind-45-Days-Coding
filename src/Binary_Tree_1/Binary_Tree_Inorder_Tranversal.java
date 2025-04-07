package Binary_Tree_1;

import java.util.*;

//94. Binary Tree Inorder Traversal
public class Binary_Tree_Inorder_Tranversal {

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
		public List<Integer> inorderTraversal(TreeNode root) {
			List<Integer> ans = new ArrayList<>();
			inOrder(root, ans);
			return ans;
		}

		public void inOrder(TreeNode node, List<Integer> ans) {
			if (node == null) {
				return;
			}
			inOrder(node.left, ans);
			ans.add(node.val);
			inOrder(node.right, ans);
		}
	}

}
