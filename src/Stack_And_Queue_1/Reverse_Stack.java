package Stack_And_Queue_1;

import java.util.*;

public class Reverse_Stack {

	public static void main(String[] args) {
		int[] stack = { 1, 3, 5, 4, 7, 6, 8, 9 };
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < stack.length; i++) {
			st.push(stack[i]);
		}
		System.out.println(st);
		st = reverse(st);
		System.out.println(st);
	}

//	Using Recursion:

//	public static void reverse(Stack<Integer> st) {
//		if (st.isEmpty()) {
//			return;
//		}
//		int val = st.pop();
//		reverse(st);
//		insertAtBottom(val, st);
//	}

//	public static void insertAtBottom(int item, Stack<Integer> st) {
//		if (st.isEmpty()) {
//			st.push(item);
//			return;
//		}
//		int val = st.pop();
//		insertAtBottom(item, st);
//		st.push(val);
//	}

//	Using Iteration:

	public static Stack<Integer> reverse(Stack<Integer> st) {
		Stack<Integer> temp = new Stack<>();
		while (!st.isEmpty()) {
			temp.push(st.pop());
		}
		return temp;
	}

}
