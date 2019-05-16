
import java.io.*;
import java.util.*;

class quickestimate {
  public static void main (String [] args) throws IOException {
	  BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	  int times = Integer.parseInt(file.readLine());
	  while (times-->0) {
		  System.out.println(new String(file.readLine()).length());
	  }
  }
}
