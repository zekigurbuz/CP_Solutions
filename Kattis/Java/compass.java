
import java.util.*;
import java.io.*;

class compass {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int orig = Integer.parseInt(file.readLine());
		int next = Integer.parseInt(file.readLine());
		if (orig > next) {
			int firstIdea = orig - next;
			int secondIdea = 360 - orig + next;
			if (firstIdea < secondIdea) {
				System.out.println(-firstIdea);
			}
			else {
				System.out.println(secondIdea);
			}
		}
		else if (orig < next) {
			int firstIdea = next - orig;
			int secondIdea = orig + 360 - next;
			if (firstIdea <= secondIdea) {
				System.out.println(firstIdea);
			}
			else {
				System.out.println(-secondIdea);
			}
		}
		else {
			System.out.println("0");
		}
	}
}
