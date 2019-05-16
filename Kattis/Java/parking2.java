
import java.io.*;
import java.util.*;

class parking2 {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int times = file.nextInt();
	 file.nextLine();
	 for (int asdf = 0; asdf < times; asdf ++) {
		 int numStops = file.nextInt();
		 file.nextLine();
		 int[] stops = Arrays.stream(file.nextLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
		 int min = 100;
		 int max = -1;
		 for (int i : stops) {
			 min = Math.min(i, min);
			 max = Math.max(i,  max);
		 }
		 System.out.println(2 * (max - min));
	 }
  }
}
