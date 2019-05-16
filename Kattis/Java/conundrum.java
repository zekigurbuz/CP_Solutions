
import java.io.*;
import java.util.*;

class conundrum {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 String line = file.nextLine();
	 int counter = 0;
	 for (int i = 0; i < line.length(); i++) {
		 if (i % 3 == 0) {
			 if (line.charAt(i) != 'P') {
				 counter++;
			 }
		 }
		 else if (i % 3 == 1) {
			 if (line.charAt(i) != 'E') {
				 counter++;
			 }
		 }
		 else {
			 if (line.charAt(i) != 'R') {
				 counter++;
			 }
		 }
	 }
	 System.out.println(counter);
  }
}
