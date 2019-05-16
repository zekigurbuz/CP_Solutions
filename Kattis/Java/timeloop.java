
import java.io.*;
import java.util.*;

class timeloop {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int times = file.nextInt();
	 for (int i = 1; i <= times; i++) {
		 System.out.println(i + " Abracadabra");
	 }
  }
}
