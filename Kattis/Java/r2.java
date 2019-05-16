
import java.io.*;
import java.util.*;

class r2 {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int r1 = file.nextInt();
	 int s = file.nextInt();
	 /*
	  * s = (r1 + r2) / 2
	  * 2s = r1 + r2
	  * 2s - r1 = r2
	  */
	 int r2 = 2 * s - r1;
	 System.out.println(r2);
  }
}
