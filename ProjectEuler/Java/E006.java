
public class E006 {
	public static void main(String[] args) {
		double sumOfTheSquares = 0L;
		double squareOfTheSum = 0L;
		for (int i = 1; i <= 100; i++) {
			squareOfTheSum += i;
			sumOfTheSquares += Math.pow(i, 2);
		}
		squareOfTheSum = Math.pow(squareOfTheSum, 2);
		System.out.printf("%f", Math.max(sumOfTheSquares, squareOfTheSum) - Math.min(sumOfTheSquares, squareOfTheSum));
	}
}
