
import java.io.*;
import java.util.*;

class grassseed {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 double price = file.nextDouble();
	 int n = file.nextInt();
	 double totalCost = 0;
	 for (int i = 0; i < n; i++) {
		 double h = file.nextDouble();
		 double w = file.nextDouble();
		 totalCost += h * w * price;
	 }
	 System.out.println(String.format("%.7f", totalCost));
  }
}
