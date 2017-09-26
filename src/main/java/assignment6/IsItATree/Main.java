package assignment6.IsItATree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		String c = new String();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		c = reader.readLine();
		int d = Integer.parseInt(c);
		//@SuppressWarnings("resource")
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		

		int caseNum = 0;
		Set<Integer> V = new HashSet<Integer>();
		Set<Integer> S = new HashSet<Integer>();
		int count = 0;
		boolean flag = true;

		int a;
		int b;
		
		while (scanner.hasNext()) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			if (a <= -1 && b <= -1) {
				return;
			}

			if (a != 0 || b != 0) {
				V.add(a);
				V.add(b);
				S.add(b);
				count++;
			} else {
				if (S.size() == V.size() - 1 && count == V.size() - 1) {
					flag = true;
				} else {
					if (S.size() == 1 && V.size() == 1 && S.iterator().next() == V.iterator().next()) {
						flag = false;
					} else if(S.size() == 0 && V.size() == 0) {
						flag = true;
					} else {
						flag = false;
					}
				}
				if (flag) {
					System.out.println("Case " + (caseNum + 1) + " is a tree.");
				} else {
					System.out.println("Case " + (caseNum + 1) + " is not a tree.");
				}

				count = 0;
				V.clear();
				S.clear();
				caseNum++;
			}

		}
		scanner.close();
	}

}
