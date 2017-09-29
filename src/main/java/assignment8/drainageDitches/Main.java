import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.event.AncestorEvent;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String ditch;

		String line = reader.readLine().trim();
		String[] items = line.split(" ");
		int n = Integer.parseInt(items[0]);
		int m = Integer.parseInt(items[1]);
		

		while(n != 0 && m != 0) {
			int [][] matrix = new int[m + 1][m + 1];

			for(int i = 0; i < n; i++) {
				ditch = reader.readLine().trim();
				String[] eaches = ditch.split(" ");
				matrix[Integer.parseInt(eaches[0])][Integer.parseInt(eaches[1])] = Integer.parseInt(eaches[2]);
			}

			//Main.printMatrix(matrix);

			// Apply EK
			
			int answer = Main.ek(matrix, 1, m);
			System.out.println(answer);


			line = reader.readLine().trim();
			items = line.split(" ");
			n = Integer.parseInt(items[0]);
			m = Integer.parseInt(items[1]);
		}

		reader.close();
	}
	
	public static int ek(int[][] matrix, int s, int t) {
		int f = 0;
		
		int[] pre = new int[matrix.length];
		while(bfs(matrix, pre, s, t)) {
			int min = 0x3f3f3f3f;
			for (int i = t; i != s; i = pre[i]) {
				min = Math.min(min, matrix[pre[i]][i]);
			} 
			
			for(int i = t; i != s; i = pre[i]) {
				matrix[pre[i]][i] -= min;
				matrix[i][pre[i]] += min;
			}
			f += min;
		}
		
		return f;
	}
	
	public static boolean bfs(int[][] matrix, int[] pre, int s, int node) {
		Arrays.fill(pre, -1);
		pre[s] = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(s);
		while(!queue.isEmpty()) {
			int first = queue.poll();
			for(int i = 1; i <= node; ++i) {
				if(pre[i] == -1 && matrix[first][i] != 0) {
					queue.offer(i);
					pre[i] = first;
					if(i == node) {
						return true;
					}
				}
			}
		}
		return false;
		
	}

	public static void printMatrix(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
