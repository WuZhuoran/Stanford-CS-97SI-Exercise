

package assignment1.financialManagement;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * @author Oliver
 * <a>http://poj.org/problem?id=1004</a>
 * */
public class Main {

	private static final int MONTHS = 12;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double sum = 0;
		for (int i = 0; i < MONTHS; i++) {
			sum += scanner.nextDouble();
		}
		DecimalFormat df = new DecimalFormat(".00");
		System.out.println("$" + df.format((sum / 12)));
		
		scanner.close();

	}

}
