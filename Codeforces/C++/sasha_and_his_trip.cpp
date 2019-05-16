#include <iostream>
#include <cmath>
using namespace std;
int main() {
	int n, v, p = 1, t = 0, a = 0; cin >> n >> v;
	while (p != n) {
		if (t < v && p + t < n) {
			a += p * min(v - t, max(0, n - p));
			t = v;
		}
		p++;
		t--;
	}
	cout << a << endl;
}
