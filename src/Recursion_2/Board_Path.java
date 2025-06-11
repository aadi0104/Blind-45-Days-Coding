package Recursion_2;

public class Board_Path {

	public static void main(String[] args) {
		int dice = 3;
		int place = 4;
		int ans = path(dice, place, "", 0);
		System.out.print(ans);
	}

	public static int path(int dice, int place, String path, int pathSum) {
		if (pathSum > place) {
			return 0;
		}
		if (pathSum == place) {
			System.out.println(path);
			return 1;
		}
		int ans = 0;
		for (int i = 1; i <= dice; i++) {
			ans += path(dice, place, path + i, pathSum + i);
		}
		return ans;
	}
	
}
