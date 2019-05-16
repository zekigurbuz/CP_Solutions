#include <iostream>
#include <cmath>
using namespace std;
int main() {
	int n, x; cin >> n;
	int a = 0, b = 0;
	for (int i = 0; i < n; i++) {
		cin >> x;
		if (x < 0) {
			a++;
		}
		else if (x > 0) {
			b++;
		}
	}
	if (a >= ceil(n/2.0)) {
		cout << -1 << endl;
	}
	else if (b >= ceil(n/2.0)) {
		cout << 1 << endl;
	}
	else {
		cout << 0 << endl;
	}
	return 0;
}
