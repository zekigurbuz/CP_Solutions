#include <iostream>
using namespace std;
int main() {
	int n; cin >> n;
	int a[n][2];
	for (int i = 0; i < n; i++) {
		cin >> a[i][0] >> a[i][1];
	}
	int k; cin >> k;
	for (int i = 0; i < n; i++) {
		if (a[i][1] >= k) {
			cout << n - i << endl;
			return 0;
		}
	}
	cout << 0 << endl;
}
