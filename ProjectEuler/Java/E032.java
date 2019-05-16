import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class E032 {
	static ArrayList<Integer> previousProds;
	public static void main(String[] args) {
		BigInteger total = new BigInteger("0");
		previousProds = new ArrayList();
		for (long i = 10; i < 999999999; i++) {
			for (long j = 10; j < 999999999; j++) {
				if (isPan(i,j, i * j)) {
					BigInteger ii = new BigInteger(Long.toString(i));
					BigInteger jj = new BigInteger(Long.toString(j));
					BigInteger iijj = new BigInteger(ii.multiply(jj).toString());
					total = total.add(iijj);
				}
			}
			
		}
		System.out.println(total);
	}
	public static boolean isPan(long one, long two, long prod) {
		if (previousProds.contains(prod)) return false;
		String result = "" + one + two + prod;
		ArrayList<String> allNums = new ArrayList();
		if (result.length() != 9) return false;
		for (int i = 0; i < result.length(); i++) {
			allNums.add(Character.toString(result.charAt(i)));
		}
		for (int i = 1; i <= 9; i++) {
			int howMany = Collections.frequency(allNums, i);
			if (howMany < 1 || howMany > 1) return false;
		}
		return true;
	}
}
