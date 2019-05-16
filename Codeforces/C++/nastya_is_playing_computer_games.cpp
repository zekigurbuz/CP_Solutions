#include <iostream>
#include <cmath>
using namespace std;
int main() {
	int n, k; cin >> n >> k;
	int a = k - 1, b = n - k;
	int c = max(a,b), d = min(a,b);
	cout << d * 2 + c + 2 * n + 1 << endl;
}
