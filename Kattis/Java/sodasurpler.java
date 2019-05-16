
import java.io.*;
import java.util.*;

class sodasurpler {
  public static void main (String [] args) throws IOException {
	  BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	  int[] efc = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
	  int numSodas = efc[1];
	  int emptyBottles = efc[0];
	  int neededForAnother = efc[2];
	  emptyBottles += numSodas;
	  int res = 0;
	  while (emptyBottles >= neededForAnother) {
		  res += emptyBottles / neededForAnother;
		  emptyBottles = emptyBottles % neededForAnother + emptyBottles / neededForAnother;
	  }
	  System.out.println(res);
  }
}
