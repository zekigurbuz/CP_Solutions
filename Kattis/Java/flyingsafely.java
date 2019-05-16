
import java.util.*;
import java.io.*;

class flyingsafely {
  public static void main (String [] args) throws IOException {
	  BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	  int times = Integer.parseInt(file.readLine());
	  while (times-->0) {
		  StringTokenizer lineReader = new StringTokenizer(file.readLine());
		  int x = Integer.parseInt(lineReader.nextToken());
		  System.out.println(x - 1);
		  x = Integer.parseInt(lineReader.nextToken());
		  while (x-->0) file.readLine();
	  }
  }
}
