package Recursion_And_Backtracking_3;

// 79. Word Search
public class Word_Search {

	static class Solution {

		public boolean exist(char[][] board, String word) {
			int n = board.length;
			int m = board[0].length;
			boolean[][] visited = new boolean[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (board[i][j] == word.charAt(0)) {
						if (search(n, m, board, word, i, j, visited, 0)) {
							return true;
						}
					}
				}
			}
			return false;
		}

		public boolean search(int n, int m, char[][] board, String word, int row, int col, boolean[][] visited,
				int idx) {
			if (idx == word.length()) {
				return true;
			}
			if (row < 0 || col < 0 || row >= n || col >= m || visited[row][col]
					|| board[row][col] != word.charAt(idx)) {
				return false;
			}
			visited[row][col] = true;
			boolean found = search(n, m, board, word, row - 1, col, visited, idx + 1) || // Up
					search(n, m, board, word, row, col + 1, visited, idx + 1) || // Right
					search(n, m, board, word, row + 1, col, visited, idx + 1) || // Down
					search(n, m, board, word, row, col - 1, visited, idx + 1); // Left
			visited[row][col] = false;

			return found;
		}

	}

	public static void main(String[] args) {
		Solution s = new Solution();
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		s.exist(board, word);
	}
	
}
