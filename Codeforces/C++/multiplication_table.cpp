#include <iostream>
using namespace std;
int main() {
	int n, m, a = 0;
	cin >> n >> m;
	for (int i = 1; i <= n; i++) {
		if (m % i == 0 && i * m/i == m && m/i <= n) {
			a++;
		}
	}
	cout << a << '\n';
	return 0;
}
