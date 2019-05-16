
import java.io.*;
import java.util.*;

class numberfun {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int times = file.nextInt();
	 file.nextLine();
	 for (int asdf = 0; asdf < times; asdf++) {
		 int a = file.nextInt();
		 int b = file.nextInt();
		 int c = file.nextInt();
		 if (a + b == c || a - b == c || b - a == c || a * b == c || (double) a / b == c || (double) b / a == c) {
			 System.out.println("Possible");
		 }
		 else {
			 System.out.println("Impossible");
		 }
	 }
  }
}
