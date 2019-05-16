
import java.io.*;
import java.util.*;

class alphabetspam {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 char[] line = file.nextLine().toCharArray();
	 double white = 0, lower = 0, upper = 0, symbol = 0;
	 double total = line.length;
	 for (int i = 0; i < line.length; i++) {
		 if (line[i] == '_') {
			 white++;
		 }
		 else if (line[i] >= 'A' && line[i] <=  'Z') {
			 upper++;
		 }
		 else if (line[i] >= 'a' && line[i] <= 'z') {
			 lower++;
		 }
		 else {
			 symbol++;
		 }
	 }
	 System.out.printf("%.16f%n%.16f%n%.16f%n%.16f%n", white/total, lower/total, upper/total, symbol/total);
  }
}
