
import java.io.*;
import java.util.*;

class oddities {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int x = file.nextInt();
	 for (int i = 0; i < x; i++) {
		 int t = file.nextInt();
		 System.out.println(t + " is " + (t % 2 == 0 ? "even" : "odd"));
	 }
  }
}
