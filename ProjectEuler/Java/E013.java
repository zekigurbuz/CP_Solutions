import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class E013 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("E013.dat"));
		BigInteger sum = new BigInteger("0");
		while (file.hasNext()) {
			sum = sum.add(new BigInteger(file.nextLine()));
		}
		System.out.println(sum.toString().substring(0, 10));
	}
}
