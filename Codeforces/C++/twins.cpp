#include <iostream>
#include <algorithm>
using namespace std;
int main() {
	int n, s=0, t=0; cin >> n;
	int a[n];
	for (int i = 0; i < n; i++) {
		cin >> a[i]; s+= a[i];
	}
	sort(a, a + n);
	reverse(a, a + n);
	for (int i = 0; i < n; i++) {
		t += a[i];
		s -= a[i];
		if (t > s) {
			cout << i + 1 << endl;
			return 0;
		}
	}
}
