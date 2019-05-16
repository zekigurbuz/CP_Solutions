
import java.io.*;
import java.util.*;

class speedlimit {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 while (file.hasNext()) {
		 int x = file.nextInt();
		 if (x == -1) break;
		 int miles = 0;
		 int elapsed = 0;
		 for (int i = 0; i < x; i++) {
			 int speed = file.nextInt();
			 int w = file.nextInt();
			 int limit = (int) Math.abs(elapsed - w);
			 elapsed = w;
			 miles += speed * limit;
		 }
		 System.out.println(miles + " miles");
	 }
  }
}
