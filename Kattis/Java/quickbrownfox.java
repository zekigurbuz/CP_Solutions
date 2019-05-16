
import java.io.*;
import java.util.*;

class quickbrownfox {
  public static void main (String [] args) throws IOException {
	  BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	  int n = Integer.parseInt(file.readLine());
	  for (int i = 0; i < n; i++) {
		  String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
		  char[] alphaArray = alphabet.toCharArray();
		  String line = file.readLine().toLowerCase().replaceAll("[^a-z]", "");
		  for (int j = line.length() - 1; j >= 0; j--) {
			  char c = line.charAt(j);
			  if (line.indexOf(c) < j) {
				  line = line.substring(0,j) + line.substring(j + 1);
			  }
		  }
		  char[] lineArray = line.toCharArray();
		  Arrays.sort(lineArray);
		//  System.out.println(Arrays.toString(lineArray));
		  if (alphaArray.length == lineArray.length) {
			  System.out.println("pangram");
		  }
		  else {
			  System.out.print("missing ");
			  for (char c : alphaArray) if (line.indexOf(c) == -1) System.out.print(c);
			  System.out.println();
		  }
	  }
  }
}
