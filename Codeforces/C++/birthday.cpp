#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	int n, l = 0; cin >> n;
	int a[n], b[n];
	for (int i = 0; i < n; i++) cin >> a[i];
	sort(a, a + n);
	for (int i = 0; i < n; i += 2) b[l++] = a[i];
	for (int i = n - 1 - n % 2; i >= 0; i -= 2) b[l++] = a[i];
	for (int i = 0; i < n; i++) {
		if (i > 0) cout << ' ';
		cout << b[i];
	}
	cout << endl; return 0;
}
