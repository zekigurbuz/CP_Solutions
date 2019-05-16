
import java.io.*;
import java.util.*;

class railroad2 {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int x = file.nextInt();
	 int y = file.nextInt();
	 System.out.println(y % 2 == 0 ? "possible" : "impossible");
  }
}
