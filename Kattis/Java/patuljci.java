
import java.util.*;
import java.io.*;

class patuljci {
	
	public static ArrayList<Integer> sol;
	
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int[] dwarves = {
				Integer.parseInt(file.readLine()), 
				Integer.parseInt(file.readLine()),
				Integer.parseInt(file.readLine()),
				Integer.parseInt(file.readLine()),
				Integer.parseInt(file.readLine()),
				Integer.parseInt(file.readLine()),
				Integer.parseInt(file.readLine()),
				Integer.parseInt(file.readLine()),
				Integer.parseInt(file.readLine())
		};
		sol = null;
		recur(100, 0, dwarves, new ArrayList<Integer>());
		for (int i : sol)
		System.out.println(i);
	}
	@SuppressWarnings("unchecked")
	public static void recur(int target, int index, int[] dwarves, ArrayList<Integer> current) {
		if (index == dwarves.length) {
			if (target == 0 && current.size() == 7) {
				sol = (ArrayList<Integer>) current.clone();
				return;
			}
			return;
		}
		if (target == 0 && current.size() == 7) {
			sol = (ArrayList<Integer>) current.clone();
			return;
		}
		recur(target, index + 1, dwarves, current);
		current.add(dwarves[index]);
		recur(target - dwarves[index], index + 1, dwarves, current);
		current.remove(current.size() - 1);
	}
}
