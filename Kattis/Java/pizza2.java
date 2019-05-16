
import java.io.*;
import java.util.*;

class pizza2 {
  public static void main (String [] args) throws IOException {
	  BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	  double[] rc = Arrays.stream(file.readLine().split(" ")).mapToDouble(n -> Double.parseDouble(n)).toArray();
	  double r = rc[0];
	  double c = rc[1];
	  double areaTotal = Math.PI * r * r;
	  double areaNotCrust = Math.PI * (r-c) * (r-c);
	  System.out.println(areaNotCrust / areaTotal * 100);
  }
}
