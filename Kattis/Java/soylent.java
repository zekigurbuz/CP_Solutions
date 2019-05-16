
import java.io.*;
import java.util.*;

class soylent {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int times = Integer.parseInt(file.nextLine());
	 while (times-->0) {
		 double intake = Double.parseDouble(file.nextLine());
		 System.out.println((int) Math.ceil(intake / 400));
	 }
  }
}
