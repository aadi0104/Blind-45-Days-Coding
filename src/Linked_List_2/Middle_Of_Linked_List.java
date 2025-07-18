package Linked_List_2;

// 141. Linked List Cycle
public class Middle_Of_Linked_List {

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

		public ListNode middleNode(ListNode head) {
			ListNode slow = head;
			ListNode fast = head;
			while(fast != null && fast.next!=null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow;
		}

	}
	
}
