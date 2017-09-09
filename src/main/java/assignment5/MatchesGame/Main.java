package assignment5.MatchesGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String line = reader.readLine();
			if (line.isEmpty()) {
				continue;
			}
			
			String[] term = line.split(" ");
			int result = 0;
			
			for (int i = 0; i < Integer.valueOf(term[0]); i++) {
				result ^= Integer.valueOf(term[i+1]);
			}
			
			if (result > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
