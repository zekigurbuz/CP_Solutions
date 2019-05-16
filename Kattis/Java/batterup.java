
import java.io.*;
import java.util.*;

class batterup {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 file.nextLine();
	 int[] hits = Arrays.stream(file.nextLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
	 int bases = 0;
	 int atBats = 0;
	 for (int i : hits) {
		 if (i < 0) {
			 continue;
		 }
		 bases += i;
		 atBats++;
	 }
	 System.out.println((double) bases / (double) atBats);
  }
}
