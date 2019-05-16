#include <iostream>
#include <cmath>
#include <algorithm>
#include <vector>
#define ull unsigned long long
using namespace std;
ull f[10];
bool ip(ull n) {
	if (n <= 1) return true;
	if (n == 2) return true;
	for (ull i = 2; i * i <= n; i++) if (n % i == 0) return false;
	return true;
}
int main() {
	f[0] = 1; vector<ull> a, b;
	for (ull i = 1; i < 10; i++) {
		f[i] = f[i-1] * i;
	}
	ull n, m; cin >> n >> m; n = m;
	while (m > 0) {b.push_back(m%10); m /= 10;}
	for (int i = 0; i < b.size(); i++) {
		ull q = f[b[i]];
		while (!ip(q)) {
			for (ull i = 2; i * i <= q;) {
				if (q % i == 0) {
					a.push_back(i);
					q /= i;
				}
				else {
					i++;
				}
			}
		}
		if (q != 1)
		a.push_back(q);
	}
	sort(a.begin(), a.end());
	reverse(a.begin(), a.end());
	for (int i = 0; i < a.size(); i++) {
		cout << a[i];
	}
	cout << '\n';
	return 0;
}
