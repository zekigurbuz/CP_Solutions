
import java.io.*;
import java.util.*;

class cetvrta {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 ArrayList<Integer> list1 = new ArrayList<>();
	 ArrayList<Integer> list2 = new ArrayList<>();
	 for (int i = 0; i < 3; i++) {
		 list1.add(file.nextInt());
		 list2.add(file.nextInt());
	 }
	 int x = -1;
	 int y = -1;
	 for (int i : list1) {
		 if (Collections.frequency(list1, i) == 1) {
			 x = i;
			 break;
		 }
	 }
	 for (int i : list2) {
		 if (Collections.frequency(list2, i) == 1) {
			 y = i;
			 break;
		 }
	 }
	 System.out.println(x + " " + y);
  }
}
