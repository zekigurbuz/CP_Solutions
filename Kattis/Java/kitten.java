
import java.util.*;
import java.io.*;

class kitten {

	static ArrayList<Node> nodes;

	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int pos = Integer.parseInt(file.readLine());
		nodes = new ArrayList<>();
		String line;
		while ((line = file.readLine()) != null) {
			if (line.equals("-1"))
				break;
			int[] arr = Arrays.stream(line.split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
			int dest = arr[0];
			int[] res = new int[arr.length - 1];
			for (int i = 1; i < arr.length; i++) {
				res[i - 1] = arr[i];
			}
			nodes.add(new Node(dest, res));
		}
		String path = pos + "";
		while (true) {

			boolean works = false;
			for (int i = 0; i < nodes.size(); i++) {
				for (int j = 0; j < nodes.get(i).paths.length; j++) {
					if (nodes.get(i).paths[j] == pos) {
						pos = nodes.get(i).dest;
						path += " " + pos;
						works = true;
					}
				}
			}
			if (!works) break;
		}
		System.out.println(path);
	}

	public static class Node {
		int dest;
		int[] paths;

		public Node(int dest, int[] paths) {
			this.dest = dest;
			this.paths = paths;
		}
	}
}
