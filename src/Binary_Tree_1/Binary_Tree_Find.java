package Binary_Tree_1;

import java.util.Scanner;

import Binary_Tree_1.Implementation_Of_BT_Using_Preorder.Node;

public class Binary_Tree_Find {

	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

//	Find
	public boolean Find(int item) {
		return Find(root, item);
	}

	public boolean Find(Node node, int item) {
		if (node == null) {
			return false;
		}
		if (node.val == item) {
			return true;
		}
		boolean left = Find(node.left, item);
		boolean right = Find(node.right, item);
		return left || right;
	}

}
