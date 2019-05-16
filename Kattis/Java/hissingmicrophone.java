
import java.io.*;
import java.util.*;

class hissingmicrophone {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 String line = file.nextLine();
	 System.out.println(line.contains("ss") ? "hiss" : "no hiss");
  }
}
