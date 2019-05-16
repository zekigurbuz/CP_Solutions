
import java.util.*;
import java.io.*;

class savingforretirement {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int[] temp = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
		int bAge = temp[0];
		int bRetire = temp[1];
		int bSaving = temp[2];
		int aAge = temp[3];
		int aSaving = temp[4];
		int bMoney = 0;
		for (int i = bAge; i < bRetire; i++) {
			bMoney += bSaving;
		}
		int aMoney = 0;
		for (int i = aAge; i < Integer.MAX_VALUE; i++) {
			if (aMoney > bMoney) {
				System.out.println(i);
				break;
			}
			aMoney += aSaving;
		}
	}
}
