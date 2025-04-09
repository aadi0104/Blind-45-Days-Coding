package Linked_List_1;

public class Implementation_2 {

	class Node {
		int val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public int removeFirst() {
		int val = head.val;
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			Node temp = head;
			head = head.next;
			temp.next = null;
		}
		size--;
		return val;
	}

	public int removeLast() {
		if (size == 1) {
			return removeFirst();
		} else {
			int val = tail.val;
			Node temp = getNode(size - 1);
			tail = temp;
			temp.next = null;
			size--;
			return val;
		}
	}

	public int removeAtIndex(int idx) {
		if (idx == 0) {
			return removeFirst();
		} else if (idx == size - 1) {
			return removeLast();
		} else {
			Node temp = getNode(idx - 1);
			Node curr = getNode(idx);
			int val = curr.val;
			temp.next = curr.next;
			curr.next = null;
			size--;
			return val;
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
