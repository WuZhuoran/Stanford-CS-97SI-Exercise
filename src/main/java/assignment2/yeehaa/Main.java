package assignment2.yeehaa;

import java.util.Scanner;

/**
 * 
 * @author Oliver <a>http://poj.org/problem?id=1799</a>
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for(int i = 0; i < num; i++) {
			double R = scanner.nextDouble();
			int n = scanner.nextInt();
			
			double temp = Math.sqrt(1 - Math.cos(Math.PI * 2 / n));
			System.out.println(temp);
			
			double r = (temp * R) / (Math.sqrt(2) + temp);
			
			System.out.println("Scenario #" + (i+1));
			System.out.format("%.3f%n\n", r);
		}
		
		scanner.close();
	}

}
