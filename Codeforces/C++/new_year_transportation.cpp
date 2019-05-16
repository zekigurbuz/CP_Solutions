#include <iostream>
using namespace std;
int main() {
	int n, t;
	cin >> n >> t; t--;
	int a[n];
	for (int i = 0; i < n - 1; i++) {
		cin >> a[i];
	}
	for (int i = 0;;) {
		if (i == t) {
			cout << "YES" << endl;
			return 0;
		}
		if (i >= n-1) break;
		i += a[i];
	}
	cout << "NO" << endl;
}
