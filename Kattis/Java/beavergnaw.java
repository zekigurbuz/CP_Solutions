import java.util.Scanner;

public class beavergnaw {
	public static void main(String[] args) {
		Scanner file = new Scanner(System.in);
		while (true) {
			int D = file.nextInt(), V = file.nextInt();
			if (D==0&&V==0)
				break;
			
			double d3 = D*D*D - 6*V/Math.PI;
			System.out.println(Math.pow(d3, 1/3.0));
		}
	}
}
