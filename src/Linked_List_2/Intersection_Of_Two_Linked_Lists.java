package Linked_List_2;

// 160. Intersection of Two Linked Lists
public class Intersection_Of_Two_Linked_Lists {

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

	public class Solution {

		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			ListNode l1 = headA;
			ListNode l2 = headB;
			while (l1 != l2) {
				if (l1 == null) {
					l1 = headB;
				} else {
					l1 = l1.next;
				}
				if (l2 == null) {
					l2 = headA;
				} else {
					l2 = l2.next;
				}
			}
			return l1;
		}

	}

}
