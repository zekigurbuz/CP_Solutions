
import java.util.*;
import java.io.*;

class rollcall {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Person> names = new ArrayList<>();
		String line;
		while ((line = file.readLine()) != null) {
			names.add(new Person(line));
		}
		Collections.sort(names);
		for (int i = 0; i < names.size(); i++) {
			boolean dup = false;
			for (int j = 0; j < names.size(); j++) {
				if (j != i && names.get(j).fName.equals(names.get(i).fName)) {
					dup = true;
				}
			}
			if (dup) {
				System.out.println(names.get(i).fName + " " + names.get(i).lName);
			}
			else {
				System.out.println(names.get(i).fName);
			}
		}
	}
	public static class Person implements Comparable <Person> {
		String fName;
		String lName;
		public Person (String fullName) {
			StringTokenizer reader = new StringTokenizer(fullName);
			this.fName = reader.nextToken();
			this.lName = reader.nextToken();
		}
		public int compareTo(Person o) {
			if (lName.compareTo(o.lName) < 0) return -1;
			if (lName.compareTo(o.lName) > 0) return 1;
			return (fName.compareTo(o.fName));
		}
	}
}
