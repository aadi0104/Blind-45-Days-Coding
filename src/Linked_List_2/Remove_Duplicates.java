package Linked_List_2;

// 83. Remove Duplicates from Sorted List
public class Remove_Duplicates {

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

		public ListNode deleteDuplicates(ListNode head) {
			if (head == null) {
				return head;
			}
			ListNode slow = head;
			ListNode fast = slow.next;
			while (fast != null) {
				if (slow.val == fast.val) {
					ListNode temp = fast;
					slow.next = fast.next;
					fast = fast.next;
					temp.next = null;
				} else {
					slow = slow.next;
					fast = fast.next;
				}
			}
			return head;
		}

	}
	
}
