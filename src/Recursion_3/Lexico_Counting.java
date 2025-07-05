package Recursion_3;

import java.util.*;

// 386. Lexicographical Numbers
public class Lexico_Counting {

	class Solution {

		public List<Integer> lexicalOrder(int n) {
			List<Integer> ans = new ArrayList<>();
			lexico(n, ans, 0);
			return ans;
		}

		public void lexico(int n, List<Integer> ans, int num) {
	        if (num > n) {
	            return;
	        }
	        if (num != 0) {
	            ans.add(num);
	        }
	        int i = 0;
	        if (num == 0) {
	            i = 1;
	        }
	        for (; i <= 9; i++) {
	            lexico(n, ans, num * 10 + i);
	        }
	    }

	}
	
}
