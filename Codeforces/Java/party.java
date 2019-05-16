import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class party {

	public static void main(String[] args) throws Exception {
		new party().run();
	}

	public void run() throws Exception {
		FastIO file = new FastIO();
		int n = file.nextInt();
		Node[] nodes = new Node[2001];
		ArrayList<Insert> unproc = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			int c = file.nextInt();
			if (c == -1) {
				nodes[i] = new Node(i);
			}
			else {
				Node t = new Node(i);
				if (nodes[c] == null) {
					unproc.add(new Insert(i, c));
				}
				else {
					nodes[c].children.add(t);
					nodes[i] = t;
				}
			}
		}
		while (!unproc.isEmpty()) {
			for (int i = unproc.size() - 1; i >= 0; i--) {
				if (nodes[unproc.get(i).data] == null) continue;
				else {
					Node t = new Node(unproc.get(i).index);
					nodes[unproc.get(i).data].children.add(t);
					nodes[unproc.get(i).index] = t;
					unproc.remove(i);
				}
			}
		}
		int m = 0;
		for (int i = 1; i <= n; i++) {
			if (nodes[i] == null) continue;
			State beg = new State(0, nodes[i]);
			PriorityQueue<State> q = new PriorityQueue<>();
			q.add(beg);
			while (!q.isEmpty()) {
				State cur = q.poll();
				if (cur.n.children.isEmpty()) {
					m = Math.max(m, cur.depth);
				}
				for (Node next : cur.n.children) {
					q.add(new State(cur.depth + 1, next));
				}
			}
		}
		System.out.println(m + 1);
	}
	public class Insert implements Comparable<Insert> {
		int index;
		int data;
		public Insert(int index, int data) {
			this.index = index;
			this.data = data;
		}
		public int compareTo(Insert o) {
			return Integer.compare(data, o.data);
		}
	}
	public class State implements Comparable<State> {
		int depth;
		Node n;
		public State(int depth, Node n) {
			this.depth = depth;
			this.n = n;
		}
		public int compareTo(State o) {
			return -(depth - o.depth);
		}
	}
	public class Node {
		int data;
		ArrayList<Node> children;
		public Node(int data) {
			this.data = data;
			children = new ArrayList<>();
		}
	}
	public static class FastIO {
		BufferedReader br;
		StringTokenizer st;

		public FastIO() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static long pow(long n, long p, long mod) {
		if (p == 0)
			return 1;
		if (p == 1)
			return n % mod;
		if (p % 2 == 0) {
			long temp = pow(n, p / 2, mod);
			return (temp * temp) % mod;
		} else {
			long temp = pow(n, p / 2, mod);
			temp = (temp * temp) % mod;
			return (temp * n) % mod;

		}
	}

	public static long pow(long n, long p) {
		if (p == 0)
			return 1;
		if (p == 1)
			return n;
		if (p % 2 == 0) {
			long temp = pow(n, p / 2);
			return (temp * temp);
		} else {
			long temp = pow(n, p / 2);
			temp = (temp * temp);
			return (temp * n);

		}
	}

	public static long gcd(long x, long y) {
		if (x == 0)
			return y;
		else
			return gcd(y % x, x);
	}

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		if (n <= 3)
			return true;

		if (n % 2 == 0 || n % 3 == 0)
			return false;

		for (int i = 5; i * i <= n; i = i + 6)
			if (n % i == 0 || n % (i + 2) == 0)
				return false;

		return true;
	}
}
