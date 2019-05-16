
import java.io.*;
import java.util.*;

class faktor {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 /*
	  * citation / numPub = faktor
	  * x / a = b
	  * x = ab
	  */
	 int a = file.nextInt();
	 int b = file.nextInt();
	 double impact = 0;
	 while (impact <= a * b) {
		 if (Math.ceil(impact / a) == b) {
			 break;
		 }
		 impact++;
	 }
	 System.out.println((int) impact);
  }
}
