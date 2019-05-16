
import java.io.*;
import java.util.*;

class herman {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 double rad = file.nextDouble();
	 System.out.printf("%.6f%n", cirArea(rad));
	 System.out.printf("%.6f%n", Math.pow(rad, 2) * 2);
  }
  public static double cirArea(double radius) {
	  return radius * radius * Math.PI;
  }
}
