#include <iostream>
#include <cmath>
using namespace std;
int main() {
	int n; cin >> n;
	int a[n];
	for (int i = 0; i < n; i++) cin >> a[i];
	int best = INT_MAX; int ind = -1;
	for (int i = 1; i <= 100; i++) {
		int cur = 0;
		for (int j = 0; j < n; j++) {
			cur += max(abs(a[j]-i)-1,0);
		}
		if (cur < best) {
			ind = i;
			best = cur;
		}
	}
	cout << ind << " " << best << endl;
	return 0;
}
