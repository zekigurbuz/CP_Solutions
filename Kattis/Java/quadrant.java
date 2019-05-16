
import java.io.*;
import java.util.*;

class quadrant {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int x = file.nextInt();
	 int y = file.nextInt();
	 int quad = -1;
	 if (x > 0 && y > 0) {
		 quad = 1;
	 }
	 else if (x > 0 && y < 0) {
		 quad = 4;
	 }
	 else if (x < 0 && y < 0) {
		 quad = 3;
	 }
	 else if (x < 0 && y > 0){
		 quad = 2;
	 }
	 System.out.println(quad);
  }
}
