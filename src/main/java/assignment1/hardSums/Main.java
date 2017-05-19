package assignment1.hardSums;

import java.util.Scanner;

/**
 * 
 * @author Oliver <a>http://poj.org/problem?id=2140</a>
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int sum = 1;

		for (int i = 0; i < num / 2; i++) {
			int count = 0;
			for (int j = i; j < (num / 2) + 1; j++) {
				count += j;
				if (count == num) {
					sum++;
					break;
				}
				if (count > num) {
					break;
				}
			}
		}
		
		System.out.println(sum);

		scanner.close();
	}

}
