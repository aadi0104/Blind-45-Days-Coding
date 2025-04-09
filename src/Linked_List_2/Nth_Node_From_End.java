package Linked_List_2;

// 19. Remove Nth Node From End of List
public class Nth_Node_From_End {

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

		public ListNode removeNthFromEnd(ListNode head, int n) {
			ListNode dummy = new ListNode(0);
			dummy.next = head;
			ListNode slow = dummy;
			ListNode fast = dummy;
			for (int i = 0; i <= n; i++) {
				fast = fast.next;
			}
			while (fast != null) {
				slow = slow.next;
				fast = fast.next;
			}
			fast = slow.next;
			slow.next = slow.next.next;
			fast.next = null;
			return dummy.next;
		}

	}

}
