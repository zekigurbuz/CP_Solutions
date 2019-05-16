
import java.io.*;
import java.util.*;

class cold {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 file.nextLine();
	 int count = 0;
	 int[] days = Arrays.stream(file.nextLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
	 for (int i : days) {
		 count += i < 0 ? 1 : 0;
	 }
	 System.out.println(count);
  }
}
