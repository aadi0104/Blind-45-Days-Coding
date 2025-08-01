package Binary_Tree_1;

import java.util.*;

//94. Binary Tree Inorder Traversal
public class Binary_Tree_Postorder_Tranversal {

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
		public List<Integer> postorderTraversal(TreeNode root) {
			List<Integer> ans = new ArrayList<>();
			postOrder(root, ans);
			return ans;
		}

		public void postOrder(TreeNode node, List<Integer> ans) {
			if (node == null) {
				return;
			}
			postOrder(node.left, ans);
			postOrder(node.right, ans);
			ans.add(node.val);
		}
	}
	
}
