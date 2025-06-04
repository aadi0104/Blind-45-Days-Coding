package Binary_Tree_1;

public class Binary_Tree_Height {

	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;
	
//	Height
	public int Height() {
		return Height(root);
	}

	public int Height(Node node) {
		if (node == null) {
			return -1;
		}
		int left = Height(node.left);
		int right = Height(node.right);
		return 1 + Math.max(left, right);
	}

}
