package Recursion_3;

import java.util.*;

// 22. Generate Parentheses
public class Generate_Parentheses {

	class Solution {

		public List<String> generateParenthesis(int n) {
			List<String> ans = new ArrayList<>();
			generate(n, ans, 0, 0, "");
			return ans;
		}
	
		public void generate(int n, List<String> ans, int open, int close, String temp) {
			if (open == n && close == n) {
				ans.add(temp);
				return;
			}
			if (open > n || close > open) {
				return;
			}
			generate(n, ans, open + 1, close, temp + "(");
			generate(n, ans, open, close + 1, temp + ")");
		}

	}

}
