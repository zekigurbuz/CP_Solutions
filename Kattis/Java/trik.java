import java.util.Scanner;

public class trik {
	
	public static boolean[] cups;
	
	public static void main(String[] args) {
		Scanner file = new Scanner(System.in);
		char[] steps = file.nextLine().toCharArray();
		cups = new boolean[3];
		cups[0] = true;
		for (char cur : steps) {
			if (cur == 'A') {
				swap(0,1);
			}
			else if (cur == 'B') {
				swap(1,2);
			}
			else {
				swap(0,2);
			}
		}
		if (cups[0]) {
			System.out.println(1);
		}
		else if (cups[1]) {
			System.out.println(2);
		}
		else {
			System.out.println(3);
		}
	}
	public static void swap(int i, int j) {
		boolean temp = cups[i];
		cups[i] = cups[j];
		cups[j] = temp;
	}
}
