package assignment1.hangover;

import java.util.Scanner;

/**
 * 
 * @author Oliver <a>http://poj.org/problem?id=1003</a>
 */
public class Main {

	private static final double MIN = 0.001;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double value = scanner.nextDouble();
		while (value != 0.0) {
			double b = 0;
			double i = 2;
			while (value - b > MIN) {
				b += 1 / i;
				i++;
			}

			System.out.println((i - 2) + " card(s)");

			// End
			value = scanner.nextDouble();
		}

		scanner.close();
	}

}
