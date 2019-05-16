
import java.io.*;
import java.util.*;

class sok {
  public static void main (String [] args) throws IOException {
	  BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	  double[] abc = Arrays.stream(file.readLine().split(" ")).mapToDouble(n -> Double.parseDouble(n)).toArray();
	  double[] ijk = Arrays.stream(file.readLine().split(" ")).mapToDouble(n -> Double.parseDouble(n)).toArray();
	  double maxRatio = Double.MAX_VALUE;
	  for (int i = 0; i < 3; i++) {
	  double ratio = abc[i] / ijk[i];
	  if (ratio < maxRatio) maxRatio = ratio;
	  }
	  ijk[0] *= maxRatio;
	  ijk[1] *= maxRatio;
	  ijk[2] *= maxRatio;
	  
	  System.out.printf("%.6f %.6f %.6f%n", abc[0] - ijk[0], abc[1] - ijk[1], abc[2] - ijk[2]);
  }
}
