import java.math.BigInteger;
import java.util.ArrayList;

public class E044 {
	static ArrayList<BigInteger> pen;

	public static void main(String[] args) {
		pen = new ArrayList<BigInteger>();
		long i = 1;
		while (true) {
			
			
			
			
			i++;
		}
	}

	public static void addPen(long n) {
		BigInteger num = new BigInteger(String.valueOf(n));
		num = num.multiply(new BigInteger("3"));
		num = num.subtract(new BigInteger("1"));
		num = num.multiply(new BigInteger(String.valueOf(n)));
		num = num.divide(new BigInteger("2"));
		pen.add(num);
	}
}
