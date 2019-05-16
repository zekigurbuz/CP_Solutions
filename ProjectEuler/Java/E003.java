import java.math.BigInteger;
import java.util.ArrayList;

public class E003 {
	public static void main(String[] args) {
		BigInteger x = new BigInteger("600851475143");
		BigInteger tempX = new BigInteger("600851475143");
		ArrayList<BigInteger> factors = new ArrayList();
		while (!tempX.toString().equals("0")) {
			if (x.mod(tempX).equals(new BigInteger("0"))) {
				factors.add(tempX);
			}
			tempX = tempX.subtract(new BigInteger("1"));
			System.out.println(tempX);
		}
		System.out.println(factors);
	}
}
