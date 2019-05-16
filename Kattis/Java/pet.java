
import java.io.*;
import java.util.*;

class pet {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 ArrayList<Pet> pets = new ArrayList<>();
	 int id = 1;
	 for (int i = 0; i < 5; i++) {
		 pets.add(new Pet(Arrays.stream(file.nextLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray(), id++));
	 }
	 Collections.sort(pets);
	 System.out.println(pets.get(0).id + " " + pets.get(0).score);
  }
  public static class Pet implements Comparable<Pet> {
	  int score;
	  int id;
	  public Pet(int[] scores, int id) {
		  score = 0;
		  this.id = id;
		  for (int i : scores) {
			  score += i;
		  }
	  }
	  public int compareTo(Pet other) {
		  if (this.score > other.score) return -1;
		  if (this.score < other.score) return 1;
		  return 0;
	  }
  }
}
