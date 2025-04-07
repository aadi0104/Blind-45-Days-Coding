package Binary_Tree_2;

// 101. Symmetric Tree
public class Symmetric_Tree {

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

		public boolean isSymmetric(TreeNode root) {
			return symmetric(root.left, root.right);
		}

		public boolean symmetric(TreeNode t1, TreeNode t2) {
			if (t1 == null && t2 == null) {
				return true;
			}
			if (t1 == null || t2 == null) {
				return false;
			}
			if (t1.val != t2.val) {
				return false;
			}
			boolean left = symmetric(t1.left, t2.right);
			boolean right = symmetric(t1.right, t2.left);
			return left && right;
		}

	}

}
