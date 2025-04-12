package Stack_And_Queue_1;

public class Queue_Circular {

	private int[] queue;
	private int front = 0;
	private int size = 0;

	public Queue_Circular() {
		queue = new int[10];
	}

	public boolean isFull() {
		return size == queue.length;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public void enqueue(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Overflow Condition!");
		}
		int idx = (front + size) % queue.length;
		queue[idx] = item;
		size++;
	}

	public int getFront() throws Exception {
		if (isEmpty()) {
			throw new Exception("Underflow Condition!");
		}
		return queue[front];
	}

	public int dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Underflow Condition!");
		}
		int val = queue[front];
		front = (front + 1) % queue.length;
		size--;
		return val;
	}

}
