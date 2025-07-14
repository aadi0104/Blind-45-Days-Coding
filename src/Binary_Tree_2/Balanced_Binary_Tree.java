package Binary_Tree_2;

// 110. Balanced Binary Tree
public class Balanced_Binary_Tree {

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

		public boolean isBalanced(TreeNode root) {
			return checkBalanced(root).balanced;
		}

		public Pair checkBalanced(TreeNode node) {
			if (node == null) {
				return new Pair();
			}
			Pair left = checkBalanced(node.left);
			Pair right = checkBalanced(node.right);
			Pair pair = new Pair();
			pair.ht = Math.max(left.ht, right.ht);
			pair.balanced = left.balanced && right.balanced && (left.ht - right.ht <= -1 && right.ht - left.ht <= 1);
			return pair;
		}

		class Pair {
			boolean balanced = true;
			int ht = 0;
		}

	}
	
}
