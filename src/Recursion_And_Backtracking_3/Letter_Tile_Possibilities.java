package Recursion_And_Backtracking_3;

import java.util.*;

// 1079. Letter Tile Possibilities
public class Letter_Tile_Possibilities {

	static class Solution {

		public int numTilePossibilities(String tiles) {
			boolean[] used = new boolean[tiles.length()];
			Set<String> ans = new HashSet<>();
			backtrack(tiles, "", used, ans);
			return ans.size();
		}

		private void backtrack(String tiles, String current, boolean[] used, Set<String> ans) {
			for (int i = 0; i < tiles.length(); i++) {
				if (used[i]) {
					continue;
				}
				if (i > 0 && tiles.charAt(i) == tiles.charAt(i - 1) && !used[i - 1]) {
					continue;
				}
				used[i] = true;
				String next = current + tiles.charAt(i);
				ans.add(next);
				backtrack(tiles, next, used, ans);
				used[i] = false;
			}
		}

	}

	public static void main(String[] args) {
		Solution s = new Solution();
		String tiles = "AAABBC";
		int ans = s.numTilePossibilities(tiles);
		System.out.print(ans);
	}

}
