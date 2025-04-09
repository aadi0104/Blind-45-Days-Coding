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
			Node temp = head;
			for (int i = 0; i < size - 2; i++) {
				temp = temp.next;
			}
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
			Node temp = head;
			Node curr = head;
			for (int i = 0; i < idx - 1; i++) {
				temp = temp.next;
			}
			for (int i = 0; i < idx; i++) {
				curr = curr.next;
			}
			int val = curr.val;
			temp.next = curr.next;
			curr.next = null;
			size--;
			return val;
		}
	}

}
