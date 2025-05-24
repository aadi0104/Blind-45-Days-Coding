package Binary_Tree_1;

import java.util.*;

//145. Binary Tree Postorder Traversal
public class Binary_Tree_Preorder_Tranversal {

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
		public List<Integer> preorderTraversal(TreeNode root) {
			List<Integer> ans = new ArrayList<>();
			preOrder(root, ans);
			return ans;
		}

		public void preOrder(TreeNode node, List<Integer> ans) {
			if (node == null) {
				return;
			}
			ans.add(node.val);
			preOrder(node.left, ans);
			preOrder(node.right, ans);
		}
	}
	
}
