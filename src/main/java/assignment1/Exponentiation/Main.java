package assignment1.Exponentiation;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 
 * @author Oliver <a>http://poj.org/problem?id=1001</a>
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			BigDecimal value = scanner.nextBigDecimal();
			int n = scanner.nextInt();
			value = value.pow(n);
			value = value.stripTrailingZeros();

			String str = value.toPlainString();

			if (str.startsWith("0.")) {
				str = str.substring(1);
			}

			System.out.println(str);
		}

		scanner.close();
	}

}
