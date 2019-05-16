#include <iostream>
using namespace std;
int main() {
	int g, p, b, a, d, m;
	cin >> a >> d >> m >> g >> p >> b;
	if (g < a) {
		cout << "NO" << endl;
		return 0;
	}
	else {
		g -= a;
		a = 0;
	}
	if (g + p < d) {
		cout << "NO" << endl;
		return 0;
	}
	else {
		if (g >= d) {
			g -= d;
			d = 0;
		}
		else {
			d -= g;
			g = 0;
		}
		if (d > 0) {
			p -= d;
			d = 0;
		}
	}
	if (g + p + d >= m) {
		cout << "YES" << endl;
	}
	else {
		cout << "NO" << endl;
	}
	return 0;
}
