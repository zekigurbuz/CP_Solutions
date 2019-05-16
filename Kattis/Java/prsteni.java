
import java.io.*;
import java.util.*;

class prsteni {
  public static void main (String [] args) throws IOException {
	  BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	  int numRings = Integer.parseInt(file.readLine());
	  int[] rings = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
	  int oRing = rings[0];
	  for (int i = 1; i < rings.length; i++) {
		  System.out.println(reduce(oRing, rings[i]));
	  }
  }
  public static String reduce(int oRing, int ring) {
	  for (int i = Math.min(oRing, ring); i > 1; i--) {
		  if (oRing % i == 0 && ring % i == 0) {
			  oRing /= i;
			  ring /= i;
		  }
	  }
	  return oRing + "/" + ring;
  }
}
