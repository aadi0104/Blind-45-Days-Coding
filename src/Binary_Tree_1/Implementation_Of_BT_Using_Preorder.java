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

//	Max
	public int Max() {
		return Max(root);
	}

	public int Max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int left = Max(node.left);
		int right = Max(node.right);
		return Math.max(node.val, Math.max(left, right));
	}

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

//	Preorder
	public void Preorder() {
		Preorder(root);
	}

	public void Preorder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.val + " --> ");
		Preorder(node.left);
		Preorder(node.right);
	}

//	Postorder
	public void Postorder() {
		Postorder(root);
	}

	public void Postorder(Node node) {
		if (node == null) {
			return;
		}
		Postorder(node.left);
		Postorder(node.right);
		System.out.print(node.val + " --> ");
	}

//	Inorder
	public void Inorder() {
		Inorder(root);
	}

	public void Inorder(Node node) {
		if (node == null) {
			return;
		}
		Inorder(node.left);
		System.out.print(node.val + " --> ");
		Inorder(node.right);
	}

//	Levelorder

	public void Levelorder() {
		Levelorder(root);
	}

	public void Levelorder(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node curr = q.poll();
			System.out.print(curr.val + " --> ");
			if (curr.left != null) {
				q.add(curr.left);
			}
			if (curr.right != null) {
				q.add(curr.right);
			}
		}
	}

}
