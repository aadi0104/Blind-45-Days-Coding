package Recursion_3;

import java.util.*;

// 22. Generate Parentheses
public class Generate_Parentheses {

	class Solution {

		public List<String> generateParenthesis(int n) {
			List<String> ans = new ArrayList<>();
			StringBuilder sb = new StringBuilder();
			generate(n, ans, 0, 0, sb);
			return ans;
		}

		public void generate(int n, List<String> ans, int open, int close, StringBuilder temp) {
			if (open == n && close == n) {
				ans.add(temp.toString());
				return;
			}
			if (open > n || close > open) {
				return;
			}
			temp.append("(");
			generate(n, ans, open + 1, close, temp);
			temp.deleteCharAt(temp.length() - 1);
			temp.append(")");
			generate(n, ans, open, close + 1, temp);
			temp.deleteCharAt(temp.length() - 1);
		}

	}

}
