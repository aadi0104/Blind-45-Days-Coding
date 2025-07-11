package Priority_Queue_1;

import java.util.*;

public class Heap {

//	It is Complete Binary Tree and has some priority associated with it
//	Tree with l height, then l-1 level should be completely filled, and the last level should be filled from left to right order
//	If both the Child value are greater then the parent value, it is called min heap. And max head is opposite.
//	Indexing; Parent = i, lchild = 2 * pindex + 1, rchild = 2 * pindex + 2 
//	Pindex = (cindex - 1)/2;

	private ArrayList<Integer> ll = new ArrayList<>();

	public int size() {
		return ll.size();
	}

	public int get() {
		return ll.get(0);
	}

	public void Display() {
		System.out.println(ll);
	}

	public void swap(int i, int j) {
		int temp1 = ll.get(i);
		int temp2 = ll.get(j);
		ll.set(i, temp2);
		ll.set(j, temp1);
	}

	public void add(int item) {
		ll.add(item);
		upheapify(size() - 1);
	}

	public void upheapify(int ci) {
		if (ci == 0) {
			return;
		}
		int pi = (ci - 1) / 2;
		if (ll.get(pi) > ll.get(ci)) {
			swap(pi, ci);
			upheapify(pi);
		}
	}

	public int remove() {
		swap(0, size() - 1);
		int rv = ll.remove(size() - 1);
		downheapify(0);
		return rv;
	}

	public void downheapify(int pi) {
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < size() && ll.get(lci) < ll.get(mini)) {
			mini = lci;
		}
		if (rci < size() && ll.get(rci) < ll.get(mini)) {
			mini = rci;
		}
		if (mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}
	}
	
}
