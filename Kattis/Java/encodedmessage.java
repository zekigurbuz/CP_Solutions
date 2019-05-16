
import java.io.*;
import java.util.*;

class encodedmessage {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int times = Integer.parseInt(file.nextLine());
	 for (int asdf = 0; asdf < times; asdf++) {
		 char[] line = file.nextLine().toCharArray();
		 int square = (int) Math.sqrt(line.length);
		 for (int i = square-1; i >= 0; i--) {
			 for (int j = i; j < line.length; j += square) {
				 System.out.print(line[j]);
			 }
		 }
		 System.out.println();
	 }
  }
}
