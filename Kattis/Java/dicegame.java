
import java.io.*;
import java.util.*;

class dicegame {
  public static void main (String [] args) throws IOException {
	  BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	  double[] gunnar = Arrays.stream(file.readLine().split(" ")).mapToDouble(n -> Double.parseDouble(n)).toArray();
	  double[] emma = Arrays.stream(file.readLine().split(" ")).mapToDouble(n -> Double.parseDouble(n)).toArray();
	  double e = (emma[0] + emma[1]) / 2 + (emma[2] + emma[3]) / 2;
	  double g = (gunnar[0] + gunnar[1]) / 2 + (gunnar[2] + gunnar[3]) / 2;
	  if (e > g) {
		  System.out.println("Emma");
	  }
	  else if (g > e) {
		  System.out.println("Gunnar");
	  }
	  else {
		  System.out.println("Tie");
	  }
  }
}
