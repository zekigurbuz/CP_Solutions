
import java.util.*;
import java.io.*;

class cokolada {

	public static ArrayList<Bar> bars;

	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int needed = Integer.parseInt(file.readLine());
		int power = 2;
		while (power < needed) power *= 2;
		bars = new ArrayList<Bar>();
		bars.add(new Bar(power));
		
	}
	public boolean cancer(int needed) {
		return false;
	}

	public static class Bar {
		int size;

		public Bar(int size) {
			this.size = size;
		}

		public void split() {
			if (size > 1) {
				bars.add(new Bar(size / 2));
				size /= 2;
			}
			return;
		}
	}
}
