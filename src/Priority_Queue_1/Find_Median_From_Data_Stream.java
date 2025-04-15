package Priority_Queue_1;

import java.util.*;

// 295. Find Median from Data Stream
public class Find_Median_From_Data_Stream {

//	class MedianFinder {

//		ArrayList<Integer> ll;

//		public MedianFinder() {
//			ll = new ArrayList<>();
//		}

//		public void addNum(int num) {
//			ll.add(num);
//			upheapify(ll.size() - 1);
//		}

//		public void upheapify(int ci) {
//			if (ci == 0) {
//				return;
//			}
//			int pi = (ci - 1) / 2;
//			if (ll.get(pi) > ll.get(ci)) {
//				swap(pi, ci);
//				upheapify(pi);
//			}
//		}

//		public void swap(int i, int j) {
//			int temp1 = ll.get(i);
//			int temp2 = ll.get(j);
//			ll.set(i, temp2);
//			ll.set(j, temp1);
//		}
	
//		public double findMedian() {
//			if (ll.size() == 0) return 0;
//	
//			Stack<Integer> st = new Stack<>();
//			int size = ll.size();
//			double median;
//	
//			for (int i = 0; i < size / 2; i++) {
//				st.push(remove());
//			}
//	
//			if (size % 2 != 0) {
//				median = remove();
//				st.push((int) median);
//			} else {
//				int first = remove();
//				int second = st.peek();
//				st.push(first);
//				median = (first + second) / 2.0;
//			}
//	
//			while (!st.isEmpty()) {
//				addNum(st.pop());
//			}
//	
//			return median;
//		}

//		public int remove() {
//			swap(0, ll.size() - 1);
//			int rv = ll.remove(ll.size() - 1);
//			downheapify(0);
//			return rv;
//		}

//		public void downheapify(int pi) {
//			int mini = pi;
//			int lci = 2 * pi + 1;
//			int rci = 2 * pi + 2;
//			if (lci < ll.size() && ll.get(lci) < ll.get(mini)) {
//				mini = lci;
//			}
//			if (rci < ll.size() && ll.get(rci) < ll.get(mini)) {
//				mini = rci;
//			}
//			if (mini != pi) {
//				swap(mini, pi);
//				downheapify(mini);
//			}
//		}
//	}
	
//	Optimized:
	
	class MedianFinder {

		PriorityQueue<Integer> maxHeap;
		PriorityQueue<Integer> minHeap;

		public MedianFinder() {
			maxHeap = new PriorityQueue<>(Collections.reverseOrder());
			minHeap = new PriorityQueue<>();
		}

		public void addNum(int num) {
			maxHeap.add(num);
			minHeap.add(maxHeap.poll());

			if (maxHeap.size() < minHeap.size()) {
				maxHeap.add(minHeap.poll());
			}
		}

		public double findMedian() {
			if (maxHeap.size() == minHeap.size()) {
				return (maxHeap.peek() + minHeap.peek()) / 2.0;
			}
			return maxHeap.peek();
		}
		
	}

}
