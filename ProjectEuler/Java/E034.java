import java.math.BigInteger;
import java.util.ArrayList;

public class E034 {
	public static void main(String[] args) {
		BigInteger totalSum = new BigInteger("0");
		ArrayList<Integer> factorials = new ArrayList();
		factorials.add(1);
		factorials.add(1);
		factorials.add(2);
		factorials.add(6);
		factorials.add(24);
		factorials.add(120);
		factorials.add(720);
		factorials.add(5040);
		factorials.add(40320);
		factorials.add(362880);
		for (int i = 3; i < 9999999; i++) {
			String current = Integer.toString(i);
			int digitSum = 0;
			for (int j = 0; j < current.length(); j++) {
				digitSum += factorials.get(Integer.parseInt(Character.toString(current.charAt(j))));
			}
			if (digitSum == i) totalSum = totalSum.add(new BigInteger(Integer.toString(i)));
		}
		System.out.println(totalSum.toString());
	}
}
