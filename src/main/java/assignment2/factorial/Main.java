import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String line = reader.readLine();
    while(line.trim().equals("")) {
      line = reader.readLine();
    }

    int number = Integer.parseInt(line.trim());

    while(number != 0) {
      for(int i = 0; i < number; i++) {
        int num = Integer.parseInt(reader.readLine().trim());
        int result = 0;

        while(num > 0) {
          num /= 5;
          result += num;
        }

        System.out.println(result);
      }

      line = reader.readLine();
      while(line.trim().equals("")) {
        line = reader.readLine();
      }
      number = Integer.parseInt(line.trim());
    }

    reader.close();
  }
}
