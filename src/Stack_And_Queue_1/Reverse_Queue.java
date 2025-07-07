package Stack_And_Queue_1;

import java.util.*;

public class Reverse_Queue {

	public static void main(String[] args) {
		int[] queue = { 1, 3, 5, 4, 7, 6, 8 };
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < queue.length; i++) {
			q.add(queue[i]);
		}
		System.out.println(q);
		reverse(q);
		System.out.println(q);
	}

	public static void reverse(Queue<Integer> q) {
		if(q.isEmpty()) {
			return;
		}
		int val = q.poll();
		reverse(q);
		q.add(val);
	}
	
}
