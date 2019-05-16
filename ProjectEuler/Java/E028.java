import java.math.BigInteger;
import java.util.Arrays;

public class E028 {
	public static void main(String[] args) {
		int[][] mat = new int[1001][1001];
		int inc = 1;
		int x = 500;
		int y = 500;
		int current = 1;
		final int SIZE = 1001;
		int dir = 90;
		boolean switcher = false;
		while (inc <= SIZE) {
			switch (dir) {
			case 0:
				for (int i = 0; i < inc; i++) {
					mat[x--][y] = current++;
				}
				break;
			case 90:
				for (int i = 0; i < inc; i++) {
					mat[x][y++] = current++;
				}
				break;
			case 180:
				for (int i = 0; i < inc; i++) {
					if (x + 1 < 1001 && y < 1001)
					mat[x++][y] = current++;
				}
				break;
			case 270:
				for (int i = 0; i < inc; i++) {
					mat[x][y--] = current++;
				}
				break;
			}
			if (switcher) {
				inc++;
				switcher = false;
			}
			else {
				switcher = true;
			}
			dir += 90;
			dir %= 360;
		}
		BigInteger total = new BigInteger("0");
		for (int i = 0; i < mat.length; i++) {
			total = total.add(new BigInteger(Integer.toString(mat[i][i])));
			total = total.add(new BigInteger(Integer.toString(mat[i][mat.length - i - 1])));
		}
		total = total.subtract(new BigInteger("1"));
		System.out.println(total.toString());
	}
	// 90 = right
	// 180 = down
	// 270 = left
	// 0 = up
}
