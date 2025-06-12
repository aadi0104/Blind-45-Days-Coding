package Trie_1;

import java.util.*;

// HackerRank: Tries Contacts
public class Contacts {

	class Node {
		char ch;
		HashMap<Character, Node> child = new HashMap<>();
		boolean isTerminal;
		int c = 0;
	}

	private Node root;

	public Contacts() {
		root = new Node();
	}

	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (!curr.child.containsKey(ch)) {
				Node nn = new Node();
				nn.ch = ch;
				curr.child.put(ch, nn);
			}
			curr = curr.child.get(ch);
			curr.c++;
		}
		curr.isTerminal = true;
	}

	public int search(String prefix) {
		Node curr = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (!curr.child.containsKey(ch)) {
				return 0;
			}
			curr = curr.child.get(ch);
		}
		return curr.c;
	}

}
