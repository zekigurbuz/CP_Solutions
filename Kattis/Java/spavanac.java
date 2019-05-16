
import java.io.*;
import java.util.*;

class spavanac {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int hour = file.nextInt();
	 int min = file.nextInt();
	 if (min <= 45) {
		 if (hour == 0) {
			 hour = 23;
		 }
		 else {
			 hour--;
		 }
		 min = 45 - min;
		 min = 60 - min;
	 }
	 else {
		 min = min - 45;
	 }
	 System.out.println(hour);
	 System.out.println(min);
  }
}
