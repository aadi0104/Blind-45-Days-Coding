package String_1;

// 647. Palindromic Substrings
public class Palindromic_Substrings {

	class Solution {

		public int countSubstrings(String s) {
	//			For Odd Length Palindromes
			int odd = 0;
			for (int axis = 0; axis < s.length(); axis++) {
				for (int orbit = 0; orbit < s.length(); orbit++) {
					int left = axis - orbit;
					int right = axis + orbit;
					if (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
						odd++;
					} else {
						break;
					}
				}
			}
	//			For Even Length Palindromes
			int even = 0;
			for (double axis = 0.5; axis < s.length(); axis++) {
				for (double orbit = 0.5; orbit < s.length(); orbit++) {
					int left = (int) (axis - orbit);
					int right = (int) (axis + orbit);
					if (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
						even++;
					} else {
						break;
					}
				}
			}
			return odd + even;
		}

	}

}
