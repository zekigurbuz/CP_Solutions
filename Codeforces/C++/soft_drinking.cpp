#include <iostream>
#include <cmath>
#define int long long
using namespace std;
signed main() {
	int n, k, l, c, d, p, nl, np;
	cin >> n >> k >> l >> c >> d >> p >> nl >> np;
	int ml = k * l / nl;
	int li = c * d;
	int sa = p / np;
	cout << min(ml, min(li, sa)) / n << endl;
	return 0;
}
