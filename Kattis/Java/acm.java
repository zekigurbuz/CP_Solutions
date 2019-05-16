
import java.io.*;
import java.util.*;

class acm {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int numSolved = 0;
		ArrayList<Problem> probs = new ArrayList<>();
		while (true) {
			String line = file.readLine();
			if (line.equals("-1"))
				break;
			String[] info = line.split(" ");
			int time = Integer.parseInt(info[0]);
			char id = info[1].charAt(0);
			boolean correct = info[2].equals("right");
			boolean added = false;
			for (int i = 0; i < probs.size(); i++) {
				if (probs.get(i).id == id) {
					probs.get(i).time = time;
					probs.get(i).attempts++;
					if (correct)
						probs.get(i).solved = true;
					added = true;
					break;
				}
			}
			if (!added) {
				Problem newProb = new Problem(id);
				newProb.attempts = 1;
				newProb.time = time;
				newProb.solved = correct;
				probs.add(newProb);
			}
		}
		int timeScore = 0;
		for (Problem p : probs) {
			if (!p.solved) continue;
			numSolved++;
			timeScore += p.time;
			timeScore += (p.attempts - 1) * 20;
		}
		System.out.println(numSolved + " " + timeScore);
	}

	public static class Problem {
		int attempts;
		int time;
		boolean solved;
		char id;

		public Problem(char id) {
			this.id = id;
		}
	}
}
