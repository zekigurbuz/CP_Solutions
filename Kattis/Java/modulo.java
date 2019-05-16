
import java.io.*;
import java.util.*;

class modulo {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 TreeSet<Integer> distinct = new TreeSet<>();
	 for (int i = 0; i < 10; i++) {
		 int x = file.nextInt();
		 distinct.add(x % 42);
	 }
	 System.out.println(distinct.size());
  }
}
