public class E031 {

	public static void main(String[] args) throws Exception {
		int[] coins = { 1, 2, 5, 10, 20, 50, 100, 200 };
		int tar = 200;
		int[] dp = new int[tar + 1];
		dp[0] = 1;
		for (int c : coins) {
			for (int i = 0; i < dp.length; i++)
				if (i >= c)
					dp[i] += dp[i - c];
		}
		System.out.println(dp[tar]);
	}
}