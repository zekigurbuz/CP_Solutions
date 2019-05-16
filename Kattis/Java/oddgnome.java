
import java.io.*;
import java.util.*;

class oddgnome {
  public static void main (String [] args) throws IOException {
	  BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	  int times = Integer.parseInt(file.readLine());
	  for (int asdf = 0; asdf < times; asdf++) {
		  int[] gnomes = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
		  for (int i = 2; i < gnomes.length-1; i++) {
			  if (gnomes[i] != gnomes[i-1] + 1) {
				  System.out.println(i);
				  break;
			  }
		  }
	  }
  }
}
