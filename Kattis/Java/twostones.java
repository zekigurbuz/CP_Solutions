
import java.io.*;
import java.util.*;

class twostones {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int x = file.nextInt();
	 if (x % 2 == 1) {
		 System.out.println("Alice");
	 }
	 else {
		 System.out.println("Bob");
	 }
  }
}
