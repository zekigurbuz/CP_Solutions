
import java.util.*;
import java.io.*;

class notamused {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(System.in);
		int day = 1;
		ArrayList<Person> people = new ArrayList<>();
		ArrayList<String> names = new ArrayList<>();
		while (file.hasNext()) {
			String line = file.nextLine();
			if (line.equals("OPEN")) continue;
			else if (line.equals("CLOSE")) {
				Collections.sort(people);
				System.out.println("Day " + (day++));
				for (Person p : people) {
					System.out.println(p);
				}
				System.out.println();
				people = new ArrayList<>();
				names = new ArrayList<>();
			}
			else {
				StringTokenizer reader = new StringTokenizer(line);
				String motion = reader.nextToken();
				String name = reader.nextToken();
				double money = Double.parseDouble(reader.nextToken()) / 10 *(motion.equals("EXIT") ? 1 : -1);
				if (names.contains(name)) {
					people.get(names.indexOf(name)).money += money;
				}
				else {
					people.add(new Person(name , money));
					names.add(name);
				}
			}
		}
	}
	public static class Person implements Comparable<Person> {
		String name;
		double money;
		public Person (String name, double money) {
			this.name = name;
			this.money = money;
		}
		public String toString() {
			return name + " $" + String.format("%.2f", money);
		}
		public int compareTo(Person o) {
			return this.name.compareTo(o.name);
		}
	}
}
