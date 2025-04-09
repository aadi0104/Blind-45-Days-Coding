package Linked_List_1;

// 206. Reverse Linked List
public class Reverse_Linked_List {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {

		public ListNode reverseList(ListNode head) {
			return recursive(head);
		}

		public ListNode recursive(ListNode node) {
			if (node == null || node.next == null) {
				return node;
			}
			ListNode newHead = recursive(node.next);
			node.next.next = node;
			node.next = null;
			return newHead;
		}

	}

}
