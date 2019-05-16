
import java.io.*;
import java.util.*;

class volim {
	public static final String order = "12345678";
	public static final int timesUp = 210;

	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String startIndex = file.readLine();
		int numQ = Integer.parseInt(file.readLine());
		int time = 0;
		boolean blowUp = false;
		int curIndex = order.indexOf(startIndex);
		for (int i = 0; i < numQ; i++) {
			String question = file.readLine();
			int timeUsed = Integer.parseInt(question.substring(0, question.indexOf(" ")));
			boolean correct = question.substring(question.indexOf(" ") + 1).equals("T");
			time += timeUsed;
			if (time >= timesUp) {
				System.out.println(curIndex+1);
				blowUp = true;
				break;
			}
			if (correct) {
				curIndex++;
				curIndex %= 8;
			}
		}
		if (!blowUp) {
			System.out.println(curIndex+startIndex+1);
		}
	}
}
