
import java.io.*;
import java.util.*;

class parking {
  public static void main (String [] args) throws IOException {
	  BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	  int total = 0;
	  int[] abc = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
	  int[] a = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
	  int[] b = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
	  int[] c = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
	  int begin = Math.min(Math.min(a[0], b[0]), c[0]);
	  int max = Math.max(Math.max(a[1], b[1]), c[1]);
	  for (int i = begin; i < max; i++) {
		  int numTrucks = -1;
		  if (i >= a[0] && i < a[1]) numTrucks++;
		  if (i >= b[0] && i < b[1]) numTrucks++;
		  if (i >= c[0] && i < c[1]) numTrucks++;
		  if (numTrucks >= 0)
		  total += abc[numTrucks] * ++numTrucks;
	  }
	  System.out.println(total);
  }
}
