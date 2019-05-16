
import java.io.*;
import java.util.*;

class deathknight {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int times = Integer.parseInt(file.nextLine());
	 int count = 0;
	 while (times-- > 0) {
		 String line = file.nextLine();
		 if (!line.contains("CD")) count++;
	 }
	 System.out.println(count);
  }
}
