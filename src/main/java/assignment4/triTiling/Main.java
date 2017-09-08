package assignment4.triTiling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static final int MAX = 30;
	
	public static void main(String[] args) throws IOException {
		
		int[] result = new int[Main.MAX];
		
		result[0] = 1;
		result[2] = 3;
		
		for (int i = 4; i < Main.MAX; i+=2) {
			result[i] = 4 * result[i - 2] - result[i - 4];
		}
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while(!(line = reader.readLine().trim()).equals("-1")) {
			System.out.println(result[Integer.valueOf(line).intValue()]);
		}
		
		reader.close();
	}

}
