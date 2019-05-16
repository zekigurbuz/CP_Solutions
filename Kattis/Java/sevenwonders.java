
import java.io.*;
import java.util.*;

class sevenwonders {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int tC = 0;
	 int gC = 0;
	 int cC = 0;
	 char[] line = file.nextLine().toCharArray();
	 for (int i = 0; i < line.length; i++) {
		 if (line[i] == 'T') {
			 tC++;
		 }
		 else if (line[i] == 'G') {
			 gC++;
		 }
		 else {
			 cC++;
		 }
	 }
	 int res = tC * tC + gC * gC + cC * cC + Math.min(Math.min(tC, gC), cC) * 7;
	 System.out.println(res);
  }
}
