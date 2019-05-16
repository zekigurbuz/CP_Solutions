#include <iostream>
#include <cmath>
using namespace std;
int main() {
	int n; cin >> n;
	int a[n], b[n];
	for (int i = 0; i < n; i++) {
		char c; cin >> c;
		a[i] = c - '0';
	}
	for (int i = 0; i < n; i++) {
		char c; cin >> c;
		b[i] = c - '0';
	}
	int yy = 0, nn = 0, yn = 0, ny = 0;
	for (int i = 0; i < n; i++) {
		if (a[i] && b[i]) yy++;
		if (!a[i] && !b[i]) nn++;
		if (a[i] && !b[i]) yn++;
		if (!a[i] && b[i]) ny++;
	}
	if (ny == yn && yy % 2 == 1) {
		cout << -1 << endl;
	}
	else if (abs(yn - ny) > yy || (yy - abs(yn - ny)) % 2 != 0) {
		cout << -1 << endl;
	}
	else {
		
	}
}
