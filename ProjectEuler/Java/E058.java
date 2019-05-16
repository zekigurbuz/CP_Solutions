import java.util.Arrays;

public class E058 {
	public static void main(String[] args) {
		int[][] mat = new int[25000][25000];
		int minX = mat.length / 2;
		int minY = mat.length / 2;
		int maxX = mat.length / 2;
		int maxY = mat.length / 2;
		int dim = 7;
		int x = dim / 2;
		int y = dim / 2;
		int dir = 90;
		int inc = 1;
		boolean switcher = false;
		boolean percentageIsLessThanTen = false;
		int current = 1;
		while (!percentageIsLessThanTen) {
			while (inc <= dim) {
				switch (dir) {
				case 0:
					for (int i = 0; i < inc; i++) {
						if (x - 1 >= 0 && y > 0 && y < mat.length)
						mat[x--][y] = current++;
					}
					break;
				case 90:
					for (int i = 0; i < inc; i++) {
						if (x >= 0 && x < mat.length && y >= 0 && y < mat.length)
						mat[x][y++] = current++;
					}
					break;
				case 180:
					for (int i = 0; i < inc; i++) {
						if (x + 1 < dim && y < dim && y >= 0)
						mat[x++][y] = current++;
					}
					break;
				case 270:
					for (int i = 0; i < inc; i++) {
						if (x >= 0 && y >= 0 && x < mat.length && y < mat.length)
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
				dir -= 90;
				dir = dir < 0 ? 270 : dir;
				if (x < minX) minX = x;
				if (y < minY) minY = y;
				if (x > maxX) maxX = x;
				if (y > maxY) maxY = y;
			}
			double prime = 0;
			double total = dim + dim - 1;
			for (int i = 25000 / 2 - dim; i < 25000 / 2 + dim; i++) {
				if (isPrime(mat[i][i])) prime++;
				if (isPrime(mat[i][25000 / 2 + dim])) prime++;
			}
			if (isPrime(mat[dim/2][dim/2])) prime--;
			percentageIsLessThanTen = prime / total < .1;
			System.out.println(prime / total);
			dim += 2;
		}
		System.out.println(dim);
	}
	public static boolean isPrime(int i) {
		if (i == 2 || i == 3) return true;
		if (i % 3 == 0 || i % 2 == 0 || i == 1) return false;
		int j = 5;
		int w = 2;
		while (j * j <= i)
		{	
		if (i % j == 0) return false;
		j += w;
		w = 6 - w;
		}
		return true;
	}
}
