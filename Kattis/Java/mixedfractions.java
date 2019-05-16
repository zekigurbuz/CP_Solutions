
import java.io.*;
import java.util.*;

class mixedfractions {
  public static void main (String [] args) throws IOException {
	  BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	  while (true) {
		  int[] frac = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
		  if (frac[0] == 0 && frac[1] == 0) break;
		  int x = frac[0] / frac[1];
		  frac[0] -= x * frac[1];
		  System.out.println(x + " " + frac[0] + " / " + frac[1]);
	  }
  }
}
