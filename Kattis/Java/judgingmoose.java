
import java.io.*;
import java.util.*;

class judgingmoose {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int l = file.nextInt();
	 int r = file.nextInt();
	 if (l == 0 && r == 0) {
		 System.out.println("Not a moose");
	 }
	 else if (l == r) {
		 System.out.println("Even " + (l + r));
	 }
	 else {
		 System.out.println("Odd " + (int) (Math.max(l, r) * 2));
	 }
  }
}
