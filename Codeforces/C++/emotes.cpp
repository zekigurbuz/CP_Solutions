#include <iostream>
#include <algorithm>
#define ull unsigned long long
using namespace std;
int main() {
	ull n, m, k;
	cin >> n >> m >> k;
	ull u1 = m / (k + 1);
	ull u2 = m - u1;
	ull ar[n];
	for (int i = 0; i < n; i++) {
		cin >> ar[i];
	}
	sort(ar,ar + n);
	reverse(ar, ar + n);
	cout << u1 * ar[1] + u2 * ar[0] << endl;
	return 0;
}
