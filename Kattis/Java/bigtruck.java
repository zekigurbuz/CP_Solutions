
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.function.Function;

class bigtruck {

	static int[] items;
	static int[] r1;
	static int[] r2;
	static int[] len;
	static int numNodes;
	static int numRoads;
	static int minRoad;
	static int maxToken;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		numNodes = Integer.parseInt(file.readLine());
		StringTokenizer tokenReader = new StringTokenizer(file.readLine());
		items = new int[numNodes];
		for (int i = 0; i < numNodes; i++) {
			items[i] = Integer.parseInt(tokenReader.nextToken());
		}
		numRoads = Integer.parseInt(file.readLine());
		r1 = new int[numRoads];
		r2 = new int[numRoads];
		len = new int[numRoads];
		visited = new boolean[numNodes];
		for (int i = 0; i < numRoads; i++) {
			StringTokenizer roadReader = new StringTokenizer(file.readLine());
			r1[i] = Integer.parseInt(roadReader.nextToken()) - 1;
			r2[i] = Integer.parseInt(roadReader.nextToken()) - 1;
			len[i] = Integer.parseInt(roadReader.nextToken());
		}
		minRoad = Integer.MAX_VALUE;
		maxToken = 0;
		recur(0, 0, 0);
		if (minRoad == Integer.MAX_VALUE) {
			System.out.println("impossible");
		} else {
			System.out.println(minRoad + " " + maxToken);
		}
	}

	public static void recur(int pos, int tokens, int distTravelled) {
		if (pos == numNodes - 1) {
			if (distTravelled < minRoad) {
				minRoad = distTravelled;
				maxToken = tokens + items[pos];
			}
			if (distTravelled == minRoad && tokens + items[pos] > maxToken) {
				maxToken = tokens + items[pos];
			}
		}
		if (distTravelled >= minRoad || visited[pos])
			return;
		visited[pos] = true;
		for (int i = 0; i < numRoads; i++) {
			if (r1[i] == pos) {
				recur(r2[i], tokens + items[pos], distTravelled + len[i]);
			} else if (r2[i] == pos) {
				recur(r1[i], tokens + items[pos], distTravelled + len[i]);
			}
		}
		visited[pos] = false;
	}
}
