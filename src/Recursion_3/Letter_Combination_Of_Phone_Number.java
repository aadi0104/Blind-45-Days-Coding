package Recursion_3;

import java.util.*;

// 17. Letter Combinations of a Phone Number
public class Letter_Combination_Of_Phone_Number {

	class Solution {

		static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

		public List<String> letterCombinations(String digits) {
			List<String> ans = new ArrayList<>();
			if (digits.length() == 0) {
				return ans;
			}
			combination(ans, digits, "");
			return ans;
		}

		public void combination(List<String> ans, String digits, String str) {
			if (digits.length() == 0) {
				ans.add(str);
				return;
			}
			int idx = digits.charAt(0) - '0';
			String key_value = key[idx];
			for (int i = 0; i < key_value.length(); i++) {
				combination(ans, digits.substring(1), str + key_value.charAt(i));
			}
		}

	}

}
