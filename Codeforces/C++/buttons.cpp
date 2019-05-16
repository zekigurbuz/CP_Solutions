#include <iostream>
using namespace std;
int main() {
	int n; cin >> n;
	int a =	0;
	for (int i = 0; i < n; i++) {
		a += 1 + (n - i - 1) * (i + 1);
	}
	cout << a << endl;
	return 0;
}
