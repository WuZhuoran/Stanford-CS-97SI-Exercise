package assignment1.dnaSorting;

import java.util.Scanner;

/**
 * 
 * @author Oliver <a>http://poj.org/problem?id=1007</a>
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sortLength = scanner.nextInt();
		int stringNumbers = scanner.nextInt();

		int[] measures = new int[stringNumbers];
		String[] strings = new String[sortLength];

		for (int i = 0; i < stringNumbers; i++) {
			strings[i] = new Scanner(System.in).nextLine();
			for (int j = 0; j < sortLength - 1; j++) {
				for (int j2 = j; j2 < sortLength; j2++) {
					if (strings[i].charAt(j) > strings[i].charAt(j2)) {
						measures[i]++;
					}
				}
			}
		}

		for (int i = 0; i < measures.length; i++) {
			int index = Main.getMinIndex(measures);
			measures[index] = Integer.MAX_VALUE;
			System.out.println(strings[index]);
		}

		scanner.close();
	}

	public static int getMinIndex(int[] measures) {
		int index = 0;
		for (int i = 0; i < measures.length; i++) {
			if (measures[i] < measures[index]) {
				index = i;
			}
		}
		return index;
	}
}
