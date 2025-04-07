package Binary_Tree_1;

import java.util.*;

public class Implementation_Of_BT_Using_Preorder {

	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public Implementation_Of_BT_Using_Preorder() {
		root = createTree();
	}

//	Create Tree
	public Node createTree() {
		int x = sc.nextInt();
		Node nn = new Node();
		nn.val = x;
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = createTree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = createTree();
		}
		return nn;
	}

//	Display
	public void Display() {
		Display(root);
	}

	public void Display(Node node) {
		if (node == null) {
			return;
		}
		String s = " <-- " + node.val + " --> ";
		if (node.left != null) {
			s = node.left.val + s;
		} else {
			s = "null" + s;
		}
		if (node.right != null) {
			s = s + node.right;
		} else {
			s = s + "null";
		}
		System.out.println(s);
		Display(node.left);
		Display(node.right);
	}

}
