#include <iostream>
#include <cmath>
#include <algorithm>
#define int long long
#define double long double
using namespace std;
signed main() {
	int times; cin >> times;
	int a[times];
	for (int i = 0; i < times; i++) cin >> a[i];
	sort(a, a + times);
	int diff[times];
	diff[times-1] = 0;
	for (int i = 0; i < times - 1; i++) {
		diff[i] = a[i+1] - a[i];
	}
	int maxl = -2147483648, x = diff[0], running = 1, index = 1;
	for (int i = 1; i < times;) {
		if (i == times - 1 && running == 1) {
			maxl = max(running, maxl);
			break;
		}
		else if (diff[i] + x > 5) {
			x = diff[i = ++index];
			running = 1;
		}
		else {
			x += diff[i++];
			running++;
		}
		maxl = max(maxl, running);
	}
	cout << maxl << endl;
	return 0;
}

