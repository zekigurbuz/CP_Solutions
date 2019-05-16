
import java.io.*;
import java.util.*;

class icpcawards {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int n = file.nextInt();
	 file.nextLine();
	 ArrayList<String> schools = new ArrayList<>();
	 ArrayList<String> seen = new ArrayList<>();
	 int rank = 0;
	 for (int i = 0; i < n; i++) {
		 String[] line = file.nextLine().split(" ");
		 if (seen.contains(line[0])) {
			 continue;
		 }
		 seen.add(line[0]);
		 schools.add(line[0] + " " + line[1]);
	 }
	 for (int i = 0; i < 12; i++) {
		 System.out.println(schools.get(i));
	 }
  }
}
