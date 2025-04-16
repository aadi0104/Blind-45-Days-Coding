package Trie_1;

import java.util.*;

// 14. Longest Common Prefix
public class Longest_Common_Prefix {

	class Solution {

		class Node {
			char ch;
			boolean isTerminal;
			HashMap<Character, Node> child = new HashMap<>();
			int c = 0;
		}

		private Node root;

		public Solution() {
			root = new Node();
		}

		public void insert(String word) {
			Node curr = root;
			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				if (curr.child.containsKey(ch)) {
					curr = curr.child.get(ch);
				} else {
					Node nn = new Node();
					nn.ch = ch;
					curr.child.put(ch, nn);
					curr = nn;
				}
				curr.c++;
			}
			curr.isTerminal = true;
		}

		public String longestCommonPrefix(String[] strs) {
			if (strs == null || strs.length == 0) {
				return "";
			}
			for (int i = 0; i < strs.length; i++) {
				insert(strs[i]);
			}
			StringBuilder prefix = new StringBuilder();
			Node curr = root;
			while (curr.child.size() == 1) {
				char ch = curr.child.keySet().iterator().next();
				Node next = curr.child.get(ch);
				if (next.c < strs.length) {
					break;
				}
				prefix.append(ch);
				curr = next;
			}
			return prefix.toString();
		}

	}

}
