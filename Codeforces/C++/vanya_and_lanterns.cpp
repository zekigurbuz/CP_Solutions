#include <iostream>
#include <algorithm>
#include <cmath>
#define int long long
using namespace std;
signed main() {
	int n, l; cin >> n >> l;
	int a[n];
	for (int i = 0; i < n; i++) cin >> a[i];
	sort(a, a + n);
	double lo = 0;
	double hi = 1e9;
	for (int i = 10000; i > 0; i--) {
		double mi = (lo + hi) / 2;
		bool tooSmall = false;
		for (int i = 1; i < n; i++) {
			if (a[i] - a[i-1] > 2 * mi) {
				tooSmall = true;
				break;
			}
		}
		if (a[0] > mi) tooSmall = true;
		if (l - a[n-1] > mi) tooSmall = true;
		if (tooSmall) {
			lo = mi;
		}
		else {
			hi = mi;
		}
	}
	printf("%.101f\n", lo);
}
