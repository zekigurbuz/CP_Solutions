#include <iostream>
#include <cmath>
#define int long long
using namespace std;
signed main() {
	int n, x; cin >> n;
	int b[n + 1], c[n + 1];
	for (int i = 1; i <= n; i++) {
		b[i] = -1;
	}
	for (int i = 0; i < n * 2; i++) {
		cin >> x;
		if (b[x] == -1) {
			b[x] = i + 1;
		}
		else {
			c[x] = i + 1;
		}
	}
	int ans = 0;
	b[0] = c[0] = 1;
	for (int i = 1; i <= n; i++) {
		ans += abs(b[i] - b[i-1]);
		ans += abs(c[i] - c[i-1]);
	}
	cout << ans << '\n';
	return 0;
}
