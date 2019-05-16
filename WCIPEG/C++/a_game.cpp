//code & template: zekigurbuz
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef unsigned long long ull;
#define int ll
#define endl '\n'
#define forn(a, b) for(int a=0;a<b;a++)
signed main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	int n; cin >> n; int a[n]; forn(i, n) cin >> a[i];
	int dp[n+1][n+1];forn(i,n+1)forn(j,n+1)dp[i][j]=0;
	int ans = 0;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			int k = (i + j + 1) % 2;
			if ((i == 0 && j == 0) || i + j > n) continue;
			if (k==1) {
				int aa = i > 1 ? dp[i-2][j] : 0;
				int bb = j > 1 ? dp[i][j-2] : 0;
				int cc = i > 0 && j > 0 ? dp[i-1][j-1] : 0;
				dp[i][j] = max(aa,max(bb,cc));
			}
			else {
				int aa = i > 1 ? dp[i-2][j] : 0;
				int bb = j > 1 ? dp[i][j-2] : 0;
				int cc = i > 0 && j > 0 ? dp[i-1][j-1] : 0;
				dp[i][j] = max(aa,max(bb,cc)) + max(i>0?a[i]:0, j>0?a[n-j]:0);
			}
			ans = max(ans, dp[i][j]);
		}
	}
	int q = 0, qq = 0; for(int i = 0; i < n; i += 2) q += a[i];
	for(int i = n - 1; i >= 0; i -= 2) qq += a[i];
	ans = max(ans, max(q, qq));
	cout << ans << endl;
	return 0;
}
