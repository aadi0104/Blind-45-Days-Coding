package Binary_Tree_2;

// 951. Flip Equivalent Binary Trees
public class Flip_Equivalent {

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

		public boolean flipEquiv(TreeNode root1, TreeNode root2) {
			return flipEqual(root1, root2);
		}

		public boolean flipEqual(TreeNode node1, TreeNode node2) {
			if (node1 == null && node2 == null) {
				return true;
			}
			if (node1 == null || node2 == null) {
				return false;
			}
			if (node1.val != node2.val) {
				return false;
			}
			boolean flip = flipEqual(node1.left, node2.right) && flipEqual(node1.right, node2.left);
			boolean equal = flipEqual(node1.left, node2.left) && flipEqual(node1.right, node2.right);
			return flip || equal;
		}

	}
	
}
