package Linked_List_1;

public class Implementation_1 {

	class Node {
		int val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public void addFirst(int val) {
		Node nn = new Node();
		nn.val = val;
		if (head == null) {
			head = nn;
			tail = nn;
		} else {
			nn.next = head;
			head = nn;
		}
		size++;
	}

	public void addLast(int val) {
		Node nn = new Node();
		nn.val = val;
		if (head == null) {
			addFirst(val);
		} else {
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	public void addAtIndex(int val, int idx) throws Exception {
		if (idx < 0 || idx >= size) {
			throw new Exception("Index out of Bound!");
		}
		if (idx == 0) {
			addFirst(val);
		} else if (idx == size) {
			addLast(val);
		} else {
			Node nn = new Node();
			Node temp = getNode(idx - 1);
			nn.next = temp.next;
			nn.val = val;
			temp.next = nn;
			size++;

		}
	}

	public Node getNode(int idx) {
		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

}
