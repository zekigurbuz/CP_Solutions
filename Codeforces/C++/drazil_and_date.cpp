#include <iostream>
#include <cmath>
using namespace std;
int main() {
	int a, b, c;
	cin >> a >> b >> c;
	int d = abs(a) + abs(b);
	cout << ((c-d) % 2 == 0 && c >= d ? "Yes" : "No") << '\n';
	return 0;
}
