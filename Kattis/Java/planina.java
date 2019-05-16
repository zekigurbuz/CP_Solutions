
import java.io.*;
import java.util.*;

class planina {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int x = file.nextInt();
	 int cur = (int) Math.pow(2, x)+1;
	 System.out.println((int) Math.pow(cur, 2));
  }
}
