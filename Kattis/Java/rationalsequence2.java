
import java.util.*;
import java.io.*;

class rationalsequence2 {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(file.readLine());
		for (int asdf = 0; asdf < times; asdf++) {
			ArrayList<Node> nodes = new ArrayList<>();
			nodes.add(new Node(1, 1));
			StringTokenizer lineReader = new StringTokenizer(file.readLine());
			String o1 = lineReader.nextToken();
			int index = 0;
			double[] desired = Arrays.stream(lineReader.nextToken().split("/")).mapToDouble(n -> Double.parseDouble(n)).toArray();
			boolean found = false;
			while (true) {
				if (found) break;
				int size = nodes.size();
				for (int i = 0; i < size; i++) {
					if (nodes.get(i).left == null) {
						Node n = new Node(nodes.get(i).p, nodes.get(i).p + nodes.get(i).q);
						nodes.get(i).left = n;
						nodes.add(n);
					}
					if (nodes.get(i).right == null) {
						Node n = new Node(nodes.get(i).p + nodes.get(i).q, nodes.get(i).q);
						nodes.get(i).right = n;
						nodes.add(n);
					}
					if (nodes.get(i).p == desired[0] && nodes.get(i).q == desired[1]) {
						found = true;
						index = i;
						break;
					}
				}
			}
			System.out.println(index + 1);
		}

	}

	public static class Node {
		public double p;
		public double q;
		public Node left;
		public Node right;

		public Node(double p, double q) {
			this.p = p;
			this.q = q;
			this.left = null;
			this.right = null;
		}
	}
}
