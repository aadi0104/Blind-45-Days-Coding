package Trie_1;

// 421. Maximum XOR of Two Numbers in an Array
public class Maximum_XOR_Of_Two_Numbers_In_Array {

	class Node {
		Node[] links = new Node[2];

		public boolean containsKey(int bit) {
			return links[bit] != null;
		}

		public Node get(int bit) {
			return links[bit];
		}

		public void put(int bit, Node node) {
			links[bit] = node;
		}
	}

	class Trie {
		private Node root;

		public Trie() {
			root = new Node();
		}

		public void insert(int num) {
			Node curr = root;
			for (int i = 31; i >= 0; i--) {
				int bit = (num >> i) & 1;
				if (!curr.containsKey(bit)) {
					curr.put(bit, new Node());
				}
				curr = curr.get(bit);
			}
		}

		public int getMax(int num) {
			Node curr = root;
			int maxNum = 0;
			for (int i = 31; i >= 0; i--) {
				int bit = (num >> i) & 1;
				if (curr.containsKey(1 - bit)) {
					maxNum |= (1 << i);
					curr = curr.get(1 - bit);
				} else {
					curr = curr.get(bit);
				}
			}
			return maxNum;
		}
	}

	class Solution {
		public int findMaximumXOR(int[] nums) {
			int ans = 0;
			Trie trie = new Trie();
			for (int num : nums) {
				trie.insert(num);
			}
			for (int num : nums) {
				ans = Math.max(ans, trie.getMax(num));
			}
			return ans;
		}
	}
	
}
