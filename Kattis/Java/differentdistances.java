
import java.io.*;
import java.util.*;

class differentdistances {
  public static void main (String [] args) throws IOException {
	  BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	  while (true) {
		  double[] vals = Arrays.stream(file.readLine().split(" ")).mapToDouble(n -> Double.parseDouble(n)).toArray();
		  if (vals.length == 1) break;
		  double x1 = vals[0];
		  double y1 = vals[1];
		  double x2 = vals[2];
		  double y2 = vals[3];
		  double p = vals[4];
		  double dist = Math.pow(Math.pow(Math.abs(x1 - x2), p) + Math.pow(Math.abs(y1 - y2), p), 1 / p);
		  System.out.println(dist);
	  }
  }
}
