import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    while(true) {
      String line = reader.readLine();
      if(line.trim().equals("")) {
        continue;
        //line = reader.readLine();
      }
      String[] part = line.split(" ");
      String s = part[0].trim().toLowerCase();
      String t = part[1].trim().toLowerCase();

      if(Main.isSubSequence(s, t)) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }

    }

    //reader.close();
  }

  public static boolean isSubSequence(String s, String t) {
    int i = 0;
    int j = 0;

    for(i = 0, j = 0; i < t.length() && j < s.length(); i++) {
      if(s.charAt(j) == t.charAt(i)) {
        j++;
      }
    }

    if(j == s.length()) {
      return true;
    }

    return false;
  }
}
