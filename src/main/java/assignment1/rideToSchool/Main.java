package assignment1.rideToSchool;

import java.util.Scanner;

/**
 * 
 * @author Oliver <a>http://poj.org/problem?id=1922</a>
 *
 */
public class Main {

	private static final int INF = 0x3f3f3f3f;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int cases = scanner.nextInt();
		while (cases != 0) {
			double answer = INF;
			for (int i = 0; i < cases; i++) {
				int v = scanner.nextInt();
				int t = scanner.nextInt();
				if (t < 0) {
					continue;
				}
				double time = 1.0 * t + 4.5 / v * 3600;
				answer = Math.min(answer, time);
			}
			int ans = (int) Math.ceil(answer);
			System.out.println(ans);
			cases = scanner.nextInt();
		}
		
		scanner.close();

	}

}
