import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String line = reader.readLine().trim();
		while(line.equals("")) {
			line = reader.readLine().trim();
		}

		int n = Integer.valueOf(line);


			int[][] matrix = new int[n][n];

			for(int i = 0; i < n; i++) {
				String each = reader.readLine().trim();
				for(int j = 0 ; j < n; j++) {
					if(each.charAt(j) == 'J') {
						matrix[i][j] = 1;
					} else if (each.charAt(j) == 'B') {
						matrix[i][j] = -1;
					} else {
						matrix[i][j] = 0;
					}
				}

			}



			//Main.printMatrix(matrix);

			int max = 0;

			for (int x = 0; x < n; ++x) {
				for (int y = 0; y < n; ++y) {
					if (matrix[x][y] == -1) {
						continue;
					}
					for (int i = n - 1; i >= 0; --i) {
						for (int j = n - 1; j >= y; --j) {
							if (matrix[i][j] != -1 && (matrix[i][j] != matrix[x][y] || matrix[x][y] != 0)) {
								int p = i - x;
								int q = j - y;
								if (p * p + q * q <= max) {
									continue;
								}
								if ((Main.check(n, x - q, i - q, y + p, j + p) 
									&& matrix[x - q][y + p] == 1 
									&& matrix[i - q][j + p] == 1)
								  ||(Main.check(n, x + q, i + q, y - p, j - p) 
								  	&& matrix[x + q][y - p] == 1 
								  	&& matrix[i + q][j - p] == 1)) {

									max = Math.max(max, p * p + q * q);
								}
							}
						}
					}
				}
			}

			System.out.println(max);


			// line = reader.readLine().trim();
			// while(line.equals("")) {
			// 	line = reader.readLine().trim();
			// }
			// n = Integer.valueOf(line);

		reader.close();
	}

	public static boolean check(int n, int a, int b, int c, int d) {
		return (a >= 0 && b >= 0 && c >= 0 && d >= 0) && (a < n && b < n && c < n && d < n);
	}

	public static void printMatrix(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}