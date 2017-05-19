package assignment1.verticalHistogram;

import java.util.Scanner;

/**
 * 
 * @author Oliver <a>http://poj.org/problem?id=2136</a>
 * 
 */
public class Main {

	private static int LINES = 4;

	public static void main(String[] args) {
		int[] chars = new int[26];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < LINES; i++) {

			String str = scanner.nextLine();
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) <= 90 && str.charAt(j) >= 65) {
					chars[(int) str.charAt(j) - 65]++;
				}
			}
		}
		scanner.close();

		int max = chars[getMax(chars)];

		for (int i = 0; i < max; i++) {
			for (int j = 0; j < chars.length; j++) {
				if (chars[j] >= (max - i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.print("\n");
		}

		for (int i = 0; i < chars.length; i++) {
			System.out.print((char) (i + 65));
			System.out.print(" ");
		}
		System.out.print("\n");

	}

	public static int getMax(int[] chars) {
		int index = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] > chars[index]) {
				index = i;
			}
		}
		return index;
	}

}
