import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String line = reader.readLine();
		while(line.trim().equals("")) {
			line = reader.readLine();
		}
		int nodeNum = Integer.parseInt(line.trim());

		while(nodeNum != 0) {
			int [][] matrix = new int[nodeNum][nodeNum];
			for(int i = 0; i < nodeNum; i++) {
				String[] eachLine = reader.readLine().split(" ");
				for(int j = 1; j < Integer.parseInt(eachLine[0]) * 2; j+=2) {
					//Now we have i and eachLine[j] as two nodes
					// we have eachLine[j+1] as the weight
					matrix[i][Integer.parseInt(eachLine[j]) - 1] = Integer.parseInt(eachLine[j+1]);
				}
			}

			//for(int i = 0; i < matrix.length; i++) {
			//	for(int j = 0; j < matrix[0].length; j++) {
			//		System.out.print(matrix[i][j] + " ");
			//	}
			//	System.out.println();
			//}

			// Now we have the matrix
			// find the shortest way with Floyd Alg
			
			//int[][] dist = new int[nodeNum][nodeNum];
			for(int i = 0; i < nodeNum; i++) {
				for(int j = 0; j < nodeNum; j++) {
					if(i == j) {
						matrix[i][j] = 0;
					} else {
						if(matrix[i][j] == 0){
							matrix[i][j] = 99999999;
						}	
					}
				}
			}

			for(int k = 0; k < nodeNum; k++) {
				for(int i = 0; i < nodeNum; i++) {
					for(int j = 0; j < nodeNum; j++) {
						if(matrix[i][j] > matrix[i][k] + matrix[k][j]) {
							matrix[i][j] = matrix[i][k] + matrix[k][j];
						}
					}
				}
			}

			//for(int i = 0; i < matrix.length; i++) {
			//      for(int j = 0; j < matrix[0].length; j++) {
                        //              System.out.print(matrix[i][j] + " ");
			//      }
                        //      System.out.println();													      //}

			int min = 99999999;
			int minPosition = 0;
			boolean disJoint = true;

			for(int i = 0; i < nodeNum; i++) {
				int max = 0;
				boolean reachable = true;

				for(int j = 0; j < nodeNum; j++) {
					if(matrix[i][j] == 99999999) {
						reachable = false;
						break;
					} else if(matrix[i][j] > max) {
						max = matrix[i][j];
					}
				}
				if(reachable == true) {
				
					disJoint = false;
					if(max < min) {
						min = max;
						minPosition = i;
					}
				}
			}

			if(disJoint) {
				System.out.println("disjoint");
			} else {
				System.out.println(minPosition + 1 + " " + min);
			}
			
			line = reader.readLine();
			while(line.trim().equals("")) {
				line = reader.readLine();
			}
			nodeNum = Integer.parseInt(line.trim());
		} 

		reader.close();
	}
}
