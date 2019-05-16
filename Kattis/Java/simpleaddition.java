
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class simpleaddition {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		BigInteger one = new BigInteger(file.readLine());
		BigInteger two = new BigInteger(file.readLine());
		System.out.println(one.add(two));
	}
}
