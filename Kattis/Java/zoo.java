
import java.util.*;
import java.io.*;

class zoo {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int counter = 1;
		while ((line = file.readLine()) != null) {
			if (line.equals("0")) break;
			int numAnim = Integer.parseInt(line);
			ArrayList<Animal> animals = new ArrayList<>();
			for (int i = 0; i < numAnim; i++) {
				String input = file.readLine();
				String animalName = input.substring(input.lastIndexOf(" ") + 1).toLowerCase();
				boolean added = false;
				for (int j = 0; j < animals.size(); j++) {
					if (animalName.equals(animals.get(j).name)) {
						added = true;
						animals.get(j).freq++;
					}
				}
				if (!added) {
					animals.add(new Animal(animalName, 1));
				}
			}
			Collections.sort(animals);
			System.out.println("List " + (counter++) + ":");
			for (Animal a : animals) System.out.println(a);
		}
	}
	public static class Animal implements Comparable<Animal> {
		int freq;
		String name;
		public Animal(String name, int freq) {
			this.name = name;
			this.freq = freq;
		}
		public int compareTo(Animal other) {
			return(name.compareTo(other.name));
		}
		public String toString() {
			return name + " | " + freq;
		}
	}
}
