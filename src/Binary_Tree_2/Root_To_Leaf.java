package Binary_Tree_2;

// 129. Sum Root to Leaf Numbers
public class Root_To_Leaf {

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

		public int sumNumbers(TreeNode root) {
			return sum(root, 0);
		}

		public int sum(TreeNode node, int num) {
	        if (node == null) {
	            return 0;
	        }
	        if(node.left == null && node.right == null){
	            return num * 10 + node.val;
	        }
	        int left = sum(node.left, num * 10 + node.val);
	        int right = sum(node.right, num * 10 + node.val);
	        return left + right;
	    }

	}
	
}
