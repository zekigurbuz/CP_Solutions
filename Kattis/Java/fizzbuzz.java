
import java.io.*;
import java.util.*;

class fizzbuzz {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int fizz = file.nextInt();
	 int buzz = file.nextInt();
	 int n = file.nextInt();
	 for (int i = 1; i <= n; i++) {
		 if (i % fizz == 0 && i % buzz == 0) {
			 System.out.println("FizzBuzz");
		 }
		 else if (i % fizz == 0) {
			 System.out.println("Fizz");
		 }
		 else if (i % buzz == 0) {
			 System.out.println("Buzz");
		 }
		 else {
			 System.out.println(i);
		 }
	 }
  }
}
