import java.io.*;
import java.util.*;

class ladder {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 double h = file.nextDouble();
	 double d = file.nextDouble();
	 System.out.println((int)Math.ceil(h/Math.sin((Math.toRadians(d)))));

  }
}
