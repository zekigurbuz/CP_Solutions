
import java.io.*;
import java.util.*;

class hangingout {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int cap = file.nextInt();
	 int times = file.nextInt();
	 int people = 0;
	 int counter = 0;
	 for (int asdf = 0; asdf < times; asdf++) {
		 String action = file.next();
		 int amount = file.nextInt();
		 file.nextLine();
		 if (action.equals("leave")) {
			 people -= amount;
		 }
		 else {
			 if (people + amount > cap) {
				 counter++;
			 }
			 else {
				 people += amount;
			 }
		 }
	 }
	 System.out.println(counter);
  }
}
