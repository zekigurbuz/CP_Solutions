
import java.util.*;
import java.io.*;

class boundingrobots {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = file.readLine()) != null) {
			if (line.equals("0 0")) break;
			StringTokenizer reader = new StringTokenizer(line);
			int c = Integer.parseInt(reader.nextToken());
			int r = Integer.parseInt(reader.nextToken());
			int robotX = 0;
			int robotY = 0;
			int realX = 0;
			int realY = 0;
			int numCom = Integer.parseInt(file.readLine());
			while (numCom-->0) {
				line = file.readLine();
				reader = new StringTokenizer(line);
				char dir = reader.nextToken().charAt(0);
				int amount = Integer.parseInt(reader.nextToken());
				switch (dir) {
				case 'u':
					robotY += amount;
					realY += amount;
					if (realY >= r) realY = r-1;
					break;
				case 'd':
					robotY -= amount;
					realY -= amount;
					if (realY < 0) realY = 0;
					break;
				case 'r':
					robotX += amount;
					realX += amount;
					if (realX >= c) realX = c - 1;
					break;
				case 'l':
					robotX -= amount;
					realX -= amount;
					if (realX < 0) realX = 0;
					break;
					default: break;
				}
			}
			System.out.println("Robot thinks " + robotX + " " + robotY);
			System.out.println("Actually at " + realX + " " + realY + "\n");
		}
	}
}
