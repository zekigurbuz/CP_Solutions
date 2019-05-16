
import java.io.*;
import java.util.*;

class sibice {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int n = file.nextInt();
	 int h = file.nextInt();
	 int w = file.nextInt();
	 double diag = Math.sqrt(h * h  + w * w);
	 for (int i = 0; i < n; i++) {
		 int x = file.nextInt();
		 if (x <= diag) {
			 System.out.println("DA");
		 }
		 else {
			 System.out.println("NE");
		 }
	 }
  }
}
