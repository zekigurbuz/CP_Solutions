
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class skocimis {
  public static void main (String [] args) throws IOException {
	  BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	  StringTokenizer line = new StringTokenizer(file.readLine());
      int a = Integer.parseInt(line.nextToken()), b = Integer.parseInt(line.nextToken()), c = Integer.parseInt(line.nextToken());
      System.out.println(Math.max(c - b - 1, Math.max(b - a - 1, 0)));
  }
}
