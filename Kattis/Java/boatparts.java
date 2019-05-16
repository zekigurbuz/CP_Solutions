
import java.io.*;
import java.util.*;

class boatparts {
  public static void main (String [] args) throws IOException {
	  BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	  int[] pn = Arrays.stream(file.readLine().split(" ")).mapToInt(n1 -> Integer.parseInt(n1)).toArray();
	  int n = pn[1];
	  int p = pn[0];
	  boolean avoided = false;
	  TreeSet<String> parts = new TreeSet<>();
	  for (int i = 1; i <= n; i++) {
		  parts.add(file.readLine());
		  if (parts.size() == p) {
			  System.out.println(i);
			  avoided = true;
			  break;
		  }
	  }
	  if (!avoided) {
		  System.out.println("paradox avoided");
	  }
  }
}
