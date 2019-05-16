#include <iostream>
#include <algorithm>
#include <cmath>
using namespace std;
int main() {
	int n, q;
	cin >> n >> q;
	int a[31];
	for (int i = 0; i < 31; i++) a[i] = 0;
	for (int i = 0; i < n; i++) {
		int b; cin >> b;
		a[(int) log2(b)]++;
	}
	while (q--) {
		int t; cin >> t;
		int ans = 0;
		int b[31];
		for (int i = 0; i < 31; i++) b[i] = a[i];
		for(int i = 30; i >= 0; i--) {
			if (pow(2,i) > t) continue;
			int x = t / (int) pow(2, i);
			int m = min(x, a[i]);
			a[i] -= m;
			ans += m;
			t -= m * (int) pow(2,i);
		}
		if (t > 0) {
			cout << -1 << endl;
		}
		else {
			cout << ans << endl;
		}
		for (int i = 0; i < 31; i++) a[i] = b[i];
	}
	return 0;
}
