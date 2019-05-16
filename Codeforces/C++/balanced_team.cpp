#include <iostream>
#include <algorithm>
#include <cmath>
#define int long long
using namespace std;
signed main() {
	int n; cin >> n;
	int a[n];
	for (int i = 0; i < n; i++) cin >> a[i];
	sort(a, a + n);
	int i = 0, j = 0, ans = 0;
	for (; i < n; i++) {
		for (;j < n && a[j] - a[i] <= 5; j++);
		j--;
		ans = max(ans, j-i+1);
	}
	cout << ans << endl;
}
