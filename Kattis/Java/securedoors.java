
import java.util.*;
import java.io.*;

class securedoors {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(file.readLine());
		ArrayList<Person> people = new ArrayList<>();
		while (times-->0) {
			String line = file.readLine();
			StringTokenizer reader = new StringTokenizer(line);
			String ee = reader.nextToken();
			String name = reader.nextToken();
			int index = -1;
			for (int i = 0; i < people.size(); i++) {
				if (people.get(i).name.equals(name)) {
					index = i;
				}
			}
			if (index != -1) {
				people.get(index).move(ee);
			}
			else {
				people.add(new Person(name, false));
				people.get(people.size() - 1).move(ee);
			}
		}
	}
	public static class Person {
		String name;
		boolean isInside;
		public Person(String name, boolean isInside) {
			this.name = name;
			this.isInside = isInside;
		}
		public void move(String command) {
			boolean anomaly = false;
			if (command.equals("entry")) {
				if (isInside) {
					anomaly = true;
				}
				isInside = true;
			}
			else {
				if (!isInside) {
					anomaly = true;
				}
				isInside = false;
			}
			System.out.println(name + (command.equals("entry") ? " entered" : " exited") + (anomaly ? " (ANOMALY)" : ""));
		}
	}
}
