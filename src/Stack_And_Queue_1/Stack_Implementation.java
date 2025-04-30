package Stack_And_Queue_1;

public class Stack_Implementation {

	private int[] stack;
	private int idx = -1;

	public Stack_Implementation() {
		stack = new int[5];
	}

	public boolean isFull() {
		return idx == stack.length;
	}

	public boolean isEmpty() {
		return idx == -1;
	}

	public void createStack(int len) {
		int[] new_stack = new int[len];
		for (int i = 0; i < idx; i++) {
			new_stack[i] = stack[i];
		}
		stack = new_stack;
	}

	public void push(int item) {
		if (isFull()) {
			stack[idx + 1] = item;
		} else {
			createStack(stack.length * 2);
			stack[idx + 1] = item;
		}
		idx++;
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Underflow condition!");
		}
		return stack[idx];
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Underflow condition!");
		}
		return stack[idx--];
	}

	public int size() {
		return idx + 1;
	}
	
}
