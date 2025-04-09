package Linked_List_1;

public class Implementation_3 {

	class Node {
		int val;
		Node next;
	}

	private Node head;
	private Node tail;
//	private int size;

	public int getFirst() {
		return head.val;
	}

	public int getLast() {
		return tail.val;
	}

	public int getAtIndex(int idx) {
		return getNode(idx).val;
	}

	public Node getNode(int idx) {
		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}
}
