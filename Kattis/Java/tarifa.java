
import java.io.*;
import java.util.*;

class tarifa {
  public static void main (String [] args) throws IOException {
	Scanner file = new Scanner(System.in);
    int x = Integer.parseInt(file.nextLine());
    int n = Integer.parseInt(file.nextLine());
    int minP = x;
    for (int i = 0; i < n; i++) {
    	minP += x - Integer.parseInt(file.nextLine());
    }
    System.out.println(minP);
  }
}
