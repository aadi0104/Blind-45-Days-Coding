package Recursion_And_Backtracking_3;

//import java.util.*;

public class Rat_Chases_Its_Cheese {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
		int n = 5;
		int m = 4;
		String[][] maze = new String[n][m];
		for (int i = 0; i < n; i++) {
//			String str = sc.next();
			String str = "XXOO";
			for (int j = 0; j < m; j++) {
				maze[i][j] = str.charAt(j) + "";
			}
		}
		int[][] path = new int[n][m];
		traversal(n, m, maze, new boolean[n][m], path, 0, 0);
		if (ispath == false) {
			System.out.println("NO PATH FOUND");
		}

	}

	static boolean ispath = false;

	public static void traversal(int n, int m, String[][] maze, boolean[][] visited, int[][] path, int row, int col) {
		if (row < 0 || col < 0 || row >= n || col >= m || visited[row][col] || maze[row][col].equals("X")) {
			return;
		}
		if (row == n - 1 && col == m - 1) {
			path[row][col] = 1;
			printPath(path, n, m);
			ispath = true;
			return;
		}
		visited[row][col] = true;
		path[row][col] = 1;
		traversal(n, m, maze, visited, path, row - 1, col); // Up
		traversal(n, m, maze, visited, path, row, col + 1); // Right
		traversal(n, m, maze, visited, path, row + 1, col); // Down
		traversal(n, m, maze, visited, path, row, col - 1); // Left
		path[row][col] = 0;
		visited[row][col] = false;

	}

	public static void printPath(int[][] path, int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(path[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
