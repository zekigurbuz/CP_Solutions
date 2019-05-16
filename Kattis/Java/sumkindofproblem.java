
import java.io.*;
import java.util.*;

class sumkindofproblem {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int times = Integer.parseInt(file.nextLine());
	 for (int asdf = 0; asdf < times; asdf++) {
		 int id = file.nextInt();
		 int n = file.nextInt();
		 System.out.printf("%d %d %d %d%n", id, (int) (Math.pow(n, 2) + n) / 2, (int) Math.pow(n, 2), (int) Math.pow(n, 2) + n);
	 }
  }
}
