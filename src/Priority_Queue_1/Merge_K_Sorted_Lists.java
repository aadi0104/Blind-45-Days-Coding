package Priority_Queue_1;

import java.util.*;

//23. Merge k Sorted Lists
public class Merge_K_Sorted_Lists {

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

		public ListNode mergeKLists(ListNode[] lists) {
			PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
				public int compare(ListNode o1, ListNode o2) {
					return o1.val - o2.val;
				}
			});
			for (int i = 0; i < lists.length; i++) {
				if (lists[i] != null) {
					pq.add(lists[i]);
				}
			}
			return merge(pq);
		}
	
		public ListNode merge(PriorityQueue<ListNode> pq) {
			ListNode dummy = new ListNode(0);
			ListNode prev = dummy;
			while (!pq.isEmpty()) {
				prev.next = pq.poll();
				prev = prev.next;
				if (prev.next != null) {
					pq.add(prev.next);
				}
			}
			return dummy.next;
		}

	}

}
