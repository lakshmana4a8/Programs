package oracle;

public class MinCostPath {
	public static void main(String[] args) {
		int cost[][] = { {1, 2, 3},
						 {1, 8, 2},
						 {1, 1, 3}
					   };
		System.out.println(minCost(cost));
	}
	static int minCost(int cost[][]) {
		int i, j;
		int tc[][] = new int[3][3]; 
		tc[0][0] = cost[0][0];
		for (i = 1; i < cost.length; i++) {
			tc[i][0] = tc[i-1][0] + cost[i][0];
		}
		for (j = 1; j < cost.length; j++) {
			tc[0][j] = tc[0][j-1] + cost[0][j];
		}
		for (i = 1; i < cost.length; i++) {
			for (j = 1; j < cost.length; j++) {
				tc[i][j] = min(tc[i-1][j-1], tc[i-1][j], tc[i][j-1]) + cost[i][j];
			}
		}
		return tc[cost.length - 1][cost.length - 1];
	}

	static int min(int x, int y, int z) {
		if (x < y) {
			return (x < z)? x : z;
		} else {
			return (y < z)? y : z;
		}
	}
}
