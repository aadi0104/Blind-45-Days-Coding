package Linked_List_2;

// 92. Reverse Linked List II
public class Reverse_Linked_List_II {

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

		public ListNode reverseBetween(ListNode head, int left, int right) {
			if (head == null || left == right) {
				return head;
			}
			ListNode dummy = new ListNode(0);
			dummy.next = head;
			ListNode prev = dummy;
			ListNode first = head;
			for (int i = 1; i < left; i++) {
	            prev = first;
	            first = first.next;
	        }
	        ListNode second = first;
	        for (int i = left; i < right; i++) {
	            second = second.next;
	        }
	        ListNode last = second.next;
			second.next = null;
			prev.next = reverse(first);
			first.next = last;
			return dummy.next;
		}

		public ListNode reverse(ListNode node) {
			if (node == null || node.next == null) {
				return node;
			}
			ListNode new_node = reverse(node.next);
			node.next.next = node;
			node.next = null;
			return new_node;
		}

	}
	
}
