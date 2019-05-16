
import java.util.*;
import java.io.*;

class flowshop {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer reader = new StringTokenizer(file.readLine());
		int n = Integer.parseInt(reader.nextToken());
		int m = Integer.parseInt(reader.nextToken());
		ArrayList<Swather> unused = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int[] cur = Arrays.stream(file.readLine().split(" ")).mapToInt(n1 -> Integer.parseInt(n1)).toArray();
			unused.add(new Swather(cur, i));
		}
		ArrayList<Swather>[] prod = new ArrayList[m];
		for (int i = 0; i < prod.length; i++) prod[i] = new ArrayList<Swather>();
		ArrayList<Swather> done = new ArrayList<>();
		prod[0] = unused;
		while (done.size() < n) {
			for (int i = 0; i < prod.length - 1; i++) {
				for (int j = prod[i].size() - 1; j >= 0; j--) {
					if (prod[i].get(j).arr[i] == 0) {
						prod[i+1].add(prod[i].remove(j));
					}
				}
			}
			for (int i = 0; i < prod[prod.length - 1].size(); i++) {
				if (prod[prod.length - 1].get(i).arr[prod[prod.length - 1].get(i).arr.length - 1] == 0) {
					done.add(prod[prod.length - 1].remove(i));
				}
			}
			for (int i = 0; i < prod.length; i++) {
				int minId = Integer.MAX_VALUE;
				for (int j = 0; j < prod[i].size(); j++) {
					if (prod[i].get(j).id < minId) {
						minId = prod[i].get(j).id;
					}
					prod[i].get(j).time++;
				}
				for (int j = 0; j < prod[i].size(); j++) {
					if (prod[i].get(j).id == minId) {
						prod[i].get(j).arr[i]--;
					}
				}
			}
		}
		for (Swather i : done) {
			System.out.print(i.time + " ");
		}
	}
	public static class Swather {
		int id;
		public int[] arr;
		int time;
		public Swather (int[] arr, int id) {
			this.arr = arr;
			this.time = 0;
			this.id = id;
		}
	}
}
