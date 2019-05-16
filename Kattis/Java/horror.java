
import java.util.*;
import java.io.*;

class horror {
	
	static int n;
	static int h;
	static int l;
	static int[] banList;
	static Movie[] movies;
	static char[][] relations;
	
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer reader = new StringTokenizer(file.readLine());
		n = Integer.parseInt(reader.nextToken());
		h = Integer.parseInt(reader.nextToken());
		l = Integer.parseInt(reader.nextToken());
		banList = Arrays.stream(file.readLine().split(" ")).mapToInt(n1 -> Integer.parseInt(n1)).toArray();
		movies = new Movie[n];
		for (int i = 0; i < movies.length; i++) {
			movies[i] = new Movie(i);
		}
		for (int i = 0; i < banList.length; i++) {
			movies[banList[i]].value = 0;
		}
		relations = new char[l][2];
		for (int i = 0; i < l; i++) {
			relations[i] = file.readLine().replaceAll(" ","").toCharArray();
		}
		for (int i = 0; i < relations.length; i++) {
			int first = relations[i][0] - 48;
			int second = relations[i][1] - 48;
			
		}
	}
	public static class Movie implements Comparable <Movie> {
		int id;
		int value;
		public Movie (int id) {
			this.id = id;
			this.value = 1;
		}
		public int compareTo(Movie o) {
			if (this.value > o.value) return -1;
			if (this.value < o.value) return 1;
			return Integer.compare(id, o.id);
		}
	}
}
