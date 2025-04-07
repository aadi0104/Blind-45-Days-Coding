package Binary_Tree_1;

import java.util.Scanner;

import Binary_Tree_1.Implementation_Of_BT_Using_Preorder.Node;

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
