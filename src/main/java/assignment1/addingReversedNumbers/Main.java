package assignment1.addingReversedNumbers;

import java.util.Scanner;

/**
 * 
 * @author Oliver <a>http://poj.org/problem?id=1504</a>
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();

		for (int i = 0; i < cases; i++) {
			
			int value1 = scanner.nextInt();
			int value2 = scanner.nextInt();
			
			int reverse1 = Main.getReversed(value1);
			int reverse2 = Main.getReversed(value2);
			
			System.out.println(Main.getReversed(reverse1 + reverse2));
		}
		
		scanner.close();

	}
	
	public static int getReversed(int num) {
		long reversedNum = 0;
		long input = num;
		while (input != 0) {
			reversedNum = reversedNum * 10 + input % 10;
			input = input / 10;
		}
		
		return (int)reversedNum;
	}
}
