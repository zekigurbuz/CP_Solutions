
import java.io.*;
import java.util.*;

class simonsays {
  public static void main (String [] args) throws IOException {
	  BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	  int n = Integer.parseInt(file.readLine());
	  for (int i = 0; i < n; i++) {
		  String line = file.readLine();
		  if (line.startsWith("Simon says ")) {
			  System.out.println(line.substring(11));
		  }
	  }
  }
}
