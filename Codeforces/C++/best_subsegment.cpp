#include <iostream>
#include <cmath>
using namespace std;
int main() {
	int mmax = 0;
	int n; cin >> n;
	int a[n];
	for (int i = 0; i < n; i++) {
		cin >> a[i];
		mmax = max(mmax, a[i]);
	}
	int ans = 0; int cur = 0;
	for (int i = 0; i < n; i++) {
		if (a[i] == mmax) {
			cur++;
			ans = max(ans, cur);
		}
		else {
			cur = 0;
		}
	}
	cout << max(ans, cur) << endl;
	return 0;
}
