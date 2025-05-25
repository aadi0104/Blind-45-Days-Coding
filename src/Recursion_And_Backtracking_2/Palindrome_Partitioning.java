package Recursion_And_Backtracking_2;

import java.util.*;

// 131. Palindrome Partitioning
public class Palindrome_Partitioning {

	class Solution {
	
		public List<List<String>> partition(String s) {
			List<List<String>> ans = new ArrayList<>();
			partitioning(s, new ArrayList<>(), ans, 0);
			return ans;
		}
	
		public void partitioning(String s, List<String> temp, List<List<String>> ans, int idx) {
			if (s.length() == idx) {
				ans.add(new ArrayList<>(temp));
				return;
			}
			for (int i = idx; i < s.length(); i++) {
				if (isPalindrome(s, idx, i)) {
					temp.add(s.substring(idx, i + 1));
					partitioning(s, temp, ans, i + 1);
					temp.remove(temp.size() - 1);
				}
			}
		}
	
		public boolean isPalindrome(String s, int left, int right) {
			while (left < right) {
				if (s.charAt(left++) != s.charAt(right--)) {
					return false;
				}
			}
			return true;
		}
	
	}
	
}
