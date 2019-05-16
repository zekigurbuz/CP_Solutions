#include <iostream>
#include <algorithm>
#include <cmath>
using namespace std;
int main() {
	int n, m, a, b;
	cin >> n >> m;
	bool c[n], d[m];
	for (int i = 0; i < n; i++) c[i] = false;
	for (int i = 0; i < m; i++) d[i] = false;
	cin >> a;
	while (a--) {
		int q; cin >> q; c[q] = true;
	}
	cin >> b;
	while (b--) {
		int q; cin >> q; d[q] = true;
	}
	for (int i = 0; i <= max(n,m) * max(n,m); i++) {
		c[i%n] |= d[i%m];
		d[i%m] |= c[i%n];
	}
	bool w = true;
	for (int i = 0; i < n; i++) w &= c[i];
	for (int i = 0; i < m; i++) w &= d[i];
	cout << (w ? "Yes" : "No") << '\n';
	return 0;
}
